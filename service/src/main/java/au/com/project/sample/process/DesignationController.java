/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.DesignationDTO;

/**
 *
 * @author SONY
 */
public interface DesignationController {

    void createDesignation(DesignationDTO designationDTO);

    void updateDesignation(DesignationDTO designationDTO);

    void deleteDesignation(DesignationDTO designationDTO);

    DesignationDTO findDesignation(Object id);

    List<DesignationDTO> findAllDesignation();

    List<DesignationDTO> findRangeDesignation(int[] range);

    int countDesignation();

}
