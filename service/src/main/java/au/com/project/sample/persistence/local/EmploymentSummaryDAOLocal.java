/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.EmploymentSummary;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface EmploymentSummaryDAOLocal {

    void createEmploymentSummary(EmploymentSummary employmentSummary);

    void editEmploymentSummary(EmploymentSummary employmentSummary);

    void removeEmploymentSummary(EmploymentSummary employmentSummary);

    EmploymentSummary findEmploymentSummary(Object id);

    List<EmploymentSummary> findAllEmploymentSummary();

    List<EmploymentSummary> findRangeEmploymentSummary(int[] range);

    int countEmploymentSummary();
    
}
