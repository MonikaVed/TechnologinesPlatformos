package usecases;

import lombok.Getter;
import lombok.Setter;
import  entities.Painting;
import persistence.PaintingsDAO;
import interceptors.LoggedInvocation;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@ViewScoped
@Named
@Getter @Setter
public class UpdatePaintingDetails implements Serializable
{
    private Painting painting;
    @Inject
    private  PaintingsDAO paintingsDAO;

    @PostConstruct
    private void init()
    {
        System.out.println("UpdatePaintingDetails INIT CALLED");
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer paintingId = Integer.parseInt(requestParameters.get("paintingId"));
        this.painting = paintingsDAO.findOne(paintingId);
    }

    @Transactional
    @LoggedInvocation
    public String updatePaintingExpositionNumber()
    {
        try
        {
            paintingsDAO.update(this.painting);
        } catch (OptimisticLockException e) {
            return "/paintingDetails.xhtml?faces-redirect=true&paintingId=" + this.painting.getId() + "&error=optimistic-lock-exception";
        }
        return "paintings.xhtml?authorId=" + this.painting.getAuthor().getId() + "&faces-redirect=true";
    }
}
