/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    void editDesignation(DesignationDTO designationDTO);

    void removeDesignation(DesignationDTO designationDTO);

    DesignationDTO findDesignation(Object id);

    List<DesignationDTO> findAllDesignation();

    List<DesignationDTO> findRangeDesignation(int[] range);

    int countDesignation();
    
}
