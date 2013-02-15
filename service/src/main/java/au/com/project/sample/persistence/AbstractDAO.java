/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import au.com.project.sample.common.HibernateFactory;
import au.com.project.sample.common.message.DataAccessLayerException;

/**
 * 
 * @author SONY
 */
public abstract class AbstractDAO<T> {

	private Transaction tx;

	private Class<T> entityClass;

	public AbstractDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract SessionFactory getSessionFactory();

	protected abstract void setSessionFactory(SessionFactory sessionFactory);

	protected Session getSession() {
		return getSessionFactory().openSession();
	}

	@Transactional(readOnly = false)
	public void saveOrUpdate(T entity) {
		Session session = getSession();
		session.save(entity);
		session.close();
	}

	@Transactional(readOnly = false)
	public void save(T entity) {
		Session session = getSession();
		session.save(entity);
		session.close();
	}

	public void update(T entity) {
		Session session = getSession();
		session.update(entity);
		session.close();
	}

	/*
	 * public void remove(T entity) { getSession().delete(entity); }
	 * 
	 * public T find(Object id) { return getSession().find(entityClass, id); }
	 * 
	 * public List<T> findAll() { return getSession().createQuery(
	 * "select object(o) from " + entityClass.getSimpleName() +
	 * " as o").getResultList(); }
	 * 
	 * public List<T> findRange(int[] range) { javax.persistence.Query q =
	 * getSession().createQuery( "select object(o) from " +
	 * entityClass.getSimpleName() + " as o"); q.setMaxResults(range[1] -
	 * range[0]); q.setFirstResult(range[0]); return q.getResultList(); }
	 * 
	 * public int count() { return ((Long) getSession() .createQuery(
	 * "select count(o) from " + entityClass.getSimpleName() +
	 * " as o").getSingleResult()).intValue(); }
	 */
	/*
	 * public AbstractDao() { HibernateFactory.buildIfNeeded(); }
	 *//*
		 * protected void saveOrUpdate(Object obj) { try { startOperation();
		 * getSession().saveOrUpdate(obj); tx.commit(); } catch
		 * (HibernateException e) { handleException(e); } finally {
		 * HibernateFactory.close(getSession()); } }
		 * 
		 * protected void delete(Object obj) { try { startOperation();
		 * getSession().delete(obj); tx.commit(); } catch (HibernateException e)
		 * { handleException(e); } finally {
		 * HibernateFactory.close(getSession()); } }
		 */
	protected Object find(Serializable id) {
		Object obj = null;
		try {
			Session session = getSession();
			obj = session.load(this.entityClass, id);
			session.close();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			// HibernateFactory.close(getSession());
		}
		return obj;
	}

	protected List findAll(Class clazz) {
		List objects = null;
		try {
			startOperation();
			Query query = getSession().createQuery("from " + clazz.getName());
			objects = query.list();
			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateFactory.close(getSession());
		}
		return objects;
	}

	protected void handleException(HibernateException e)
			throws DataAccessLayerException {
		HibernateFactory.rollback(tx);
		throw new DataAccessLayerException(e);
	}

	protected void startOperation() throws HibernateException {
		tx = getSession().beginTransaction();
	}
}
