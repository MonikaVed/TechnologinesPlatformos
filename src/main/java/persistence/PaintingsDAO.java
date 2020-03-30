package persistence;

import entities.Painting;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.inject.Inject;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class PaintingsDAO
{
    @Inject
    private EntityManager em;

    public void persist(Painting painting){ this.em.persist(painting); }

    public Painting findOne(Integer id)
    { return em.find(Painting.class, id); }

    public Painting update(Painting painting)
    { return em.merge(painting); }
}
