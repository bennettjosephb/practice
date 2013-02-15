/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.ProjectDAOLocal;
import au.com.project.sample.domain.Project;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.ProjectDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class ProjectDAOImpl extends AbstractDAO<Project> implements ProjectDAOLocal, ProjectDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjectDAOImpl() {
        super(Project.class);
    }

    public void createProject(Project project) {
        create(project);
    }

    public void editProject(Project project) {
        edit(project);
    }

    public void removeProject(Project project) {
        remove(project);
    }

    public Project findProject(Object id) {
        return find(id);
    }

    public List<Project> findAllProject() {
        return findAll();
    }

    public List<Project> findRangeProject(int[] range) {
        return findRange(range);
    }

    public int countProject() {
        return count();
    }
    
}
