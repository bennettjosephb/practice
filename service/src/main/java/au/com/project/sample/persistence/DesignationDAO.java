/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    void editDesignation(Designation designation);

    void removeDesignation(Designation designation);

    Designation findDesignation(Object id);

    List<Designation> findAllDesignation();

    List<Designation> findRangeDesignation(int[] range);

    int countDesignation();

}
