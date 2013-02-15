/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Project;
import au.com.project.sample.process.ProjectController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class ProjectControllerImpl  implements ProjectController{

    public void createProject(Project project){}

    public void editProject(Project project){}

    public void removeProject(Project project){}

    public Project findProject(Object id){return null;}

    public List<Project> findAllProject(){return null;}

    public List<Project> findRangeProject(int[] range){return null;}

    public int countProject(){return 0;}
    
}
