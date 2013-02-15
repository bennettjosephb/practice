/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.ApplicationUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface ApplicationUserDAOLocal {

    void createApplicationUser(ApplicationUser applicationUser);

    void editApplicationUser(ApplicationUser applicationUser);

    void removeApplicationUser(ApplicationUser applicationUser);

    ApplicationUser findApplicationUser(Object id);

    List<ApplicationUser> findAllApplicationUser();

    List<ApplicationUser> findRangeApplicationUser(int[] range);

    int countApplicationUser();
    
}
