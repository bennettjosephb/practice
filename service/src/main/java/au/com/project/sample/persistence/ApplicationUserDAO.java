/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.ApplicationUser;
import java.util.List;

/**
 *
 * author SONY
 */

public interface ApplicationUserDAO {

	ApplicationUser createApplicationUser(ApplicationUser applicationUser);

    void updateApplicationUser(ApplicationUser applicationUser);

    void deleteApplicationUser(ApplicationUser applicationUser);

    ApplicationUser findApplicationUser(Object id);

    List<ApplicationUser> findAllApplicationUser();

    List<ApplicationUser> findRangeApplicationUser(int[] range);

    int countApplicationUser();

}
