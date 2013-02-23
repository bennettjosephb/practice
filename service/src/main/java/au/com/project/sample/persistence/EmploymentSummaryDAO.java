/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.EmploymentSummary;
import java.util.List;

/**
 *
 * author SONY
 */

public interface EmploymentSummaryDAO {

	EmploymentSummary createEmploymentSummary(EmploymentSummary employmentSummary);

    void editEmploymentSummary(EmploymentSummary employmentSummary);

    void removeEmploymentSummary(EmploymentSummary employmentSummary);

    EmploymentSummary findEmploymentSummary(Object id);

    List<EmploymentSummary> findAllEmploymentSummary();

    List<EmploymentSummary> findRangeEmploymentSummary(int[] range);

    int countEmploymentSummary();

}
