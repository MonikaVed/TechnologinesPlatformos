package persistence;

import  entities.Author;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class AuthorsDAO
{
    @Inject
    private EntityManager em;

    public List<Author> loadAll()
    { return em.createNamedQuery("Author.findAll", Author.class).getResultList(); }

    public void setEm(EntityManager em) { this.em = em; }

    public void persist(Author author){ this.em.persist(author); }

    public Author findOne(Integer id) { return em.find(Author.class, id); }
}
