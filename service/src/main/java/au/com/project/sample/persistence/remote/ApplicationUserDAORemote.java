/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.ApplicationUser;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface ApplicationUserDAORemote {

    void createApplicationUser(ApplicationUser applicationUser);

    void editApplicationUser(ApplicationUser applicationUser);

    void removeApplicationUser(ApplicationUser applicationUser);

    ApplicationUser findApplicationUser(Object id);

    List<ApplicationUser> findAllApplicationUser();

    List<ApplicationUser> findRangeApplicationUser(int[] range);

    int countApplicationUser();
    
}
