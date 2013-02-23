/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.Project;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface ProjectController {

    void createProject(Project project);

    void updateProject(Project project);

    void deleteProject(Project project);

    Project findProject(Object id);

    List<Project> findAllProject();

    List<Project> findRangeProject(int[] range);

    int countProject();

}
