/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Designation;
import java.util.List;

/**
 *
 * author SONY
 */

public interface DesignationDAO {

	Designation createDesignation(Designation designation);

    void updateDesignation(Designation designation);

    void deleteDesignation(Designation designation);

    Designation findDesignation(Object id);

    List<Designation> findAllDesignation();

    List<Designation> findRangeDesignation(int[] range);

    int countDesignation();

}
