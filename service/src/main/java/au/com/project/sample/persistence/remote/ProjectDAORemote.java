/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Project;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface ProjectDAORemote {

    void createProject(Project project);

    void editProject(Project project);

    void removeProject(Project project);

    Project findProject(Object id);

    List<Project> findAllProject();

    List<Project> findRangeProject(int[] range);

    int countProject();
    
}
