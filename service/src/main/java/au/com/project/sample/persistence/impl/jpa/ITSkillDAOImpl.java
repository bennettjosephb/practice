/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.ITSkill;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.ITSkillDAO;

/**
 *
 * @author SONY
 */
public class ITSkillDAOImpl extends AbstractDAO<ITSkill> implements ITSkillDAO {
 	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public ITSkillDAOImpl() {
        super(ITSkill.class);
    }

    public void createITSkill(ITSkill iTSkill) {
        saveOrUpdate(iTSkill);
    }

    public void editITSkill(ITSkill iTSkill) {
//        edit(iTSkill);
    }

    public void removeITSkill(ITSkill iTSkill) {
  //      remove(iTSkill);
    }

    public ITSkill findITSkill(Object id) {
        return null;//find(id);
    }

    public List<ITSkill> findAllITSkill() {
        return null;//findAll();
    }

    public List<ITSkill> findRangeITSkill(int[] range) {
        return null;//findRange(range);
    }

    public int countITSkill() {
        return 0;//count();
    }

}
