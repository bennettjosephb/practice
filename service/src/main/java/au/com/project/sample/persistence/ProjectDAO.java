/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Project;
import java.util.List;

/**
 *
 * author SONY
 */

public interface ProjectDAO {

    void createProject(Project project);

    void updateProject(Project project);

    void deleteProject(Project project);

    Project findProject(Object id);

    List<Project> findAllProject();

    List<Project> findRangeProject(int[] range);

    int countProject();

}
