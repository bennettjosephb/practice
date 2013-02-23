/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.EducationSummary;
import java.util.List;

/**
 *
 * author SONY
 */

public interface EducationSummaryDAO {

	EducationSummary createEducationSummary(EducationSummary educationSummary);

    void updateEducationSummary(EducationSummary educationSummary);

    void deleteEducationSummary(EducationSummary educationSummary);

    EducationSummary findEducationSummary(Object id);

    List<EducationSummary> findAllEducationSummary();

    List<EducationSummary> findRangeEducationSummary(int[] range);

    int countEducationSummary();

}
