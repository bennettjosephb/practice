/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.EmploymentSummaryDTO;

/**
 *
 * @author SONY
 */
public interface EmploymentSummaryController {

    void createEmploymentSummary(EmploymentSummaryDTO employmentSummaryDTO);

    void updateEmploymentSummary(EmploymentSummaryDTO employmentSummaryDTO);

    void deleteEmploymentSummary(EmploymentSummaryDTO employmentSummaryDTO);

    EmploymentSummaryDTO findEmploymentSummary(Object id);

    List<EmploymentSummaryDTO> findAllEmploymentSummary();

    List<EmploymentSummaryDTO> findRangeEmploymentSummary(int[] range);

    int countEmploymentSummary();

}
