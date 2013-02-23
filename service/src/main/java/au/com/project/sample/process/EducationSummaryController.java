/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.EducationSummaryDTO;

/**
 *
 * @author SONY
 */
public interface EducationSummaryController {

    void createEducationSummary(EducationSummaryDTO educationSummaryDTO);

    void updateEducationSummary(EducationSummaryDTO educationSummaryDTO);

    void deleteEducationSummary(EducationSummaryDTO educationSummaryDTO);

    EducationSummaryDTO findEducationSummary(Object id);

    List<EducationSummaryDTO> findAllEducationSummary();

    List<EducationSummaryDTO> findRangeEducationSummary(int[] range);

    int countEducationSummary();

}
