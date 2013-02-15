/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author SONY
 */
public abstract class AbstractFacade1<T> {
    private Class<T> entityClass;

    public AbstractFacade1(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    protected void create(T entity) {
        getEntityManager().persist(entity);
    }

    protected void edit(T entity) {
        getEntityManager().merge(entity);
    }

    protected void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    protected T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    protected List<T> findAll() {
        return getEntityManager().createQuery("select object(o) from " + entityClass.getSimpleName() + " as o").getResultList();
    }

    protected List<T> findRange(int[] range) {
        javax.persistence.Query q = getEntityManager().createQuery("select object(o) from " + entityClass.getSimpleName() + " as o");
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    protected int count() {
        return ((Long) getEntityManager().createQuery("select count(o) from " + entityClass.getSimpleName() + " as o").getSingleResult()).intValue();
    }
    
}
