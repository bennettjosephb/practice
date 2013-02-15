/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.EducationSummary;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface EducationSummaryDAOLocal {

    void createEducationSummary(EducationSummary educationSummary);

    void editEducationSummary(EducationSummary educationSummary);

    void removeEducationSummary(EducationSummary educationSummary);

    EducationSummary findEducationSummary(Object id);

    List<EducationSummary> findAllEducationSummary();

    List<EducationSummary> findRangeEducationSummary(int[] range);

    int countEducationSummary();
    
}
