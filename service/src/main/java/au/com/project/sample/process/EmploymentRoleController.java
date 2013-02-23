/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.EmploymentRole;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface EmploymentRoleController {

    void createEmploymentRole(EmploymentRole employmentRole);

    void updateEmploymentRole(EmploymentRole employmentRole);

    void deleteEmploymentRole(EmploymentRole employmentRole);

    EmploymentRole findEmploymentRole(Object id);

    List<EmploymentRole> findAllEmploymentRole();

    List<EmploymentRole> findRangeEmploymentRole(int[] range);

    int countEmploymentRole();

}
