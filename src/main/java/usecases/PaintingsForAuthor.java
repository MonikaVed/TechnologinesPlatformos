package usecases;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import interceptors.LoggedInvocation;
import entities.Painting;
import entities.Author;
import persistence.PaintingsDAO;
import persistence.AuthorsDAO;

@Model
public class PaintingsForAuthor implements Serializable
{
    @Inject
    private AuthorsDAO authorsDAO;

    @Inject
    private PaintingsDAO paintingsDAO;

    @Getter @Setter
    private Author author;

    @Getter @Setter
    private Painting paintingToCreate = new Painting();

    @PostConstruct
    public void init()
    {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer authorId = Integer.parseInt(requestParameters.get("authorId"));
        this.author = authorsDAO.findOne(authorId);
    }

    @Transactional
    @LoggedInvocation
    public String createPainting()
    {
        paintingToCreate.setAuthor(this.author);
        paintingsDAO.persist(paintingToCreate);
        return "paintings?faces-redirect=true&authorId=" + this.author.getId();
    }
}
