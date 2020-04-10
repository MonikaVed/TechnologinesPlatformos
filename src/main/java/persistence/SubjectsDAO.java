package persistence;

import entities.Subject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class SubjectsDAO
{
    @Inject
    private EntityManager em;

    public void persist(Subject subject){ this.em.persist(subject); }

    public Subject findOne(Integer id)
    { return em.find(Subject.class, id); }

    public Subject update(Subject subject)
    { return em.merge(subject); }
}
