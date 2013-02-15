/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.EducationSummary;
import java.util.List;

/**
 *
 * author SONY
 */

public interface EducationSummaryDAO {

    void createEducationSummary(EducationSummary educationSummary);

    void editEducationSummary(EducationSummary educationSummary);

    void removeEducationSummary(EducationSummary educationSummary);

    EducationSummary findEducationSummary(Object id);

    List<EducationSummary> findAllEducationSummary();

    List<EducationSummary> findRangeEducationSummary(int[] range);

    int countEducationSummary();

}
