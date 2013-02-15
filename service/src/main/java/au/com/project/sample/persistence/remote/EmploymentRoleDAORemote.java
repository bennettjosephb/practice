/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.EmploymentRole;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface EmploymentRoleDAORemote {

    void createEmploymentRole(EmploymentRole employmentRole);

    void editEmploymentRole(EmploymentRole employmentRole);

    void removeEmploymentRole(EmploymentRole employmentRole);

    EmploymentRole findEmploymentRole(Object id);

    List<EmploymentRole> findAllEmploymentRole();

    List<EmploymentRole> findRangeEmploymentRole(int[] range);

    int countEmploymentRole();
    
}
