/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.ApplicationUser;
import au.com.project.sample.process.ApplicationUserController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class ApplicationUserControllerImpl implements ApplicationUserController{

    public void createApplicationUser(ApplicationUser applicationUser){}

    public void editApplicationUser(ApplicationUser applicationUser){}

    public void removeApplicationUser(ApplicationUser applicationUser){}

    public ApplicationUser findApplicationUser(Object id){return null;}

    public List<ApplicationUser> findAllApplicationUser(){return null;}

    public List<ApplicationUser> findRangeApplicationUser(int[] range){return null;}

    public int countApplicationUser(){return 0;}
    
}
