/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import au.com.project.sample.domain.State;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.StateDAO;

public class StateDAOImpl extends AbstractDAO<State> implements StateDAO {

	private SessionFactory sessionFactory;

	public StateDAOImpl() {
		super(State.class);
	}

	public void createState(State state) {
		state.setCode(state.getCode().toUpperCase());
		saveOrUpdate(state);
	}

	public void editState(State state) {
		// edit(state);
	}

	public void removeState(State state) {
		// remove(state);
	}

	public State findState(Object id) {
		return null;// find(id);
	}

	public List<State> findAllStates() {
		return null;// findAll();
	}

	public List<State> findRangeState(int[] range) {
		return null;// findRange(range);
	}

	public int countState() {
		return 0;// count();
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<State> findRange(int[] range) {
		// TODO Auto-generated method stub
		return null;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public State findStateByCode(String code) {
		Session session = getSession();

		State state = (State) session.createCriteria(State.class)
				.add(Restrictions.eq("code", code)).uniqueResult();

		session.close();

		return state;
	}

	public List<State> findStateByName(String name) {
		Session session = getSession();

		List<State> state = (List<State>) session.createCriteria(State.class)
				.add(Restrictions.eq("name", name)).list();

		session.close();

		return state;
	}
}
