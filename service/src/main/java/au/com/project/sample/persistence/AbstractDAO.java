/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import au.com.project.sample.common.HibernateFactory;
import au.com.project.sample.common.message.DataAccessLayerException;

/**
 * 
 * @author SONY
 */
public abstract class AbstractDAO<T> {

	private static Logger log = Logger.getLogger(AbstractDAO.class);

	private Transaction tx;

	private Class<T> entityClass;

	public AbstractDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	/*
	 * Implement getSessionFactory and setSessionFactory method in DAO
	 * Implementation class with public access specifier
	 */
	protected abstract SessionFactory getSessionFactory();

	protected abstract void setSessionFactory(SessionFactory sessionFactory);

	protected Session getSession() {
		return getSessionFactory().openSession();
	}

	@Transactional(readOnly = false)
	protected T saveOrUpdate(T entity) {
		Session session = null;
		try {
			if (entity != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + entity.getClass().getName() + " : "
						+ entity + " Saving");
				session.saveOrUpdate(entity);
				log.trace("Entity " + entity.getClass().getName() + " : "
						+ entity + " Saved");
//				session.close();
//				log.trace("Session Closed");
//				session = null;
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Persisting Entity "
					+ entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
		return entity;
	}

	@Transactional(readOnly = false)
	protected T save(T entity) {
		Session session = null;
		try {
			if (entity != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + entity.getClass().getName() + " : "
						+ entity + " Saving");
				session.save(entity);
				log.trace("Entity " + entity.getClass().getName() + " : "
						+ entity + " Saved");
//				session.close();
//				log.trace("Session Closed");
//				session = null;
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Persisting Entity "
					+ entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
		return entity;
	}

	protected void closeSession(Session session) {
		if (session != null) {
			try {
				session.close();
				session = null;
				log.trace("Session Closed");
			} catch (HibernateException ignored) {
				log.error("Couldn't close Session", ignored);
			}
		}
	}

	protected T update(T entity) {
		Session session = null;
		try {
			if (entity != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + entity.getClass().getName() + " : "
						+ entity + " Updating");
				session.update(entity);
				log.trace("Entity " + entity.getClass().getName() + " : "
						+ entity + " Updated");
//				session.close();
//				log.trace("Session Closed");
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Updating Entity " + entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	protected T findByCode(Serializable code) {
		Object object = null;
		Session session = null;
		try {
			if (code != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + this.entityClass.getClass().getName()
						+ " Retriving");
				object = session.createCriteria(this.entityClass)
						.add(Restrictions.eq("code", code)).uniqueResult();
				log.trace("Entity " + this.entityClass.getClass().getName()
						+ " Retrived");
//				session.close();
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Updating Entity " + entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
		return (T) object;
	}

	protected void delete(T entity) {
		Session session = null;
		try {
			if (entity != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + entity.getClass().getName() + " Removing");
				session.delete(entity);
				log.trace("Entity " + entity.getClass().getName() + " Removed");
//				session.close();
//				log.trace("Session Closed");
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Updating Entity " + entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
	}

	protected void deleteById(Serializable id) {
		Session session = null;
		try {
			if (id != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + entityClass.getName() + " Removing");
				Object obj =  session.load(entityClass,id);
			    session.delete(obj);				
				log.trace("Entity " + entityClass.getName() + " Removed");
//				session.close();
//				log.trace("Session Closed");
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Updating Entity " + entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
	}

/*	protected void deleteByCode(Serializable code) {
		Session session = null;
		try {
			if (code != null) {
				log.trace("Session Creating");
				session = getSession();
				log.trace("Entity " + entity.getClass().getName() + " Removing");
				session.delete(entity);
				log.trace("Entity " + entity.getClass().getName() + " Removed");
				session.close();
				log.trace("Session Closed");
			}
		} catch (HibernateException hibernateException) {
			log.error("Problem While Updating Entity " + entityClass.getName());
			throw hibernateException;
		} finally {
			closeSession(session);
		}
	}

*/	/*
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
	@SuppressWarnings("unchecked")
	protected T findById(Serializable id) {
		Object obj = null;
		Session session = null;
		try {
			log.trace("Session Creating");
			session = getSession();
			log.trace("Entity " + this.entityClass.getClass().getName()
					+ " Retriving");
			obj = session.load(this.entityClass, id);
			log.trace("Entity " + this.entityClass.getClass().getName()
					+ " Retrived");
//			session.close();
//			log.trace("Session Closed");
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			closeSession(session);
		}
		return (T) obj;
	}

	@SuppressWarnings("unchecked")
	protected List<T> findAll() {
		List objects = null;
		Session session = null;
		try {
			log.trace("Session Creating");
			session = getSession();
			log.trace("Query Creating for Execution");
			Query query = session.createQuery("from "
					+ (this.entityClass.getName()));
			log.trace("Query Created for Execution");
			objects = query.list();
			log.trace("Entites Retrieved Successfully");
//			session.close();
//			log.trace("Session Closed");
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			closeSession(session);
		}
		return (List<T>) objects;
	}

	protected void handleException(HibernateException e)
			throws DataAccessLayerException {
		HibernateFactory.rollback(tx);
		throw new DataAccessLayerException(e);
	}

	protected void startOperation() throws HibernateException {
		tx = getSession().beginTransaction();
	}

	protected Long count() {
		Session session = null;
		Long resultCount = null;
		try {
			session = getSession();
			log.trace("Query Creating for Execution");
			resultCount = (Long) session
					.createCriteria(this.entityClass.getName())
					.setProjection(Projections.rowCount()).uniqueResult();
			log.trace("Query Created for Execution");
//			session.close();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			closeSession(session);
		}
		return resultCount;
	}
}
