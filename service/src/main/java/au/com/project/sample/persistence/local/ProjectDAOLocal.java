/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.Project;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface ProjectDAOLocal {

    void createProject(Project project);

    void editProject(Project project);

    void removeProject(Project project);

    Project findProject(Object id);

    List<Project> findAllProject();

    List<Project> findRangeProject(int[] range);

    int countProject();
    
}
