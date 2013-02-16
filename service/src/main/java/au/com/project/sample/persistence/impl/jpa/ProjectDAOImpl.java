/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Project;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.ProjectDAO;

/**
 *
 * @author SONY
 */
public class ProjectDAOImpl extends AbstractDAO<Project> implements ProjectDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public ProjectDAOImpl() {
        super(Project.class);
    }

    public void createProject(Project project) {
        saveOrUpdate(project);
    }

    public void editProject(Project project) {
 //       edit(project);
    }

    public void removeProject(Project project) {
  //      remove(project);
    }

    public Project findProject(Object id) {
        return null;//find(id);
    }

    public List<Project> findAllProject() {
        return null;//findAll();
    }

    public List<Project> findRangeProject(int[] range) {
        return null;//findRange(range);
    }

    public int countProject() {
        return 0;//count();
    }

}
