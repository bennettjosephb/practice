/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Designation;
import au.com.project.sample.persistence.DesignationDAO;
import au.com.project.sample.process.DesignationController;
import au.com.project.sample.process.impl.dto.DesignationDTO;

/**
 *
 * @author SONY
 */
public class DesignationControllerImpl  implements DesignationController{
	
	private static Logger log = Logger
			.getLogger(DesignationControllerImpl.class);
	
	@Autowired
	private DesignationDAO designationDAO;
	
	private Designation updateCountry(DesignationDTO designationDTO) {
		Designation designation = new Designation();

		designation.setName(designationDTO.getName());
		designation.setCode(designationDTO.getCode());

		return designation;
	}



    public void createDesignation(DesignationDTO designationDTO){
    	designationDAO.createDesignation(updateCountry(designationDTO));
    }

    public void editDesignation(DesignationDTO designationDTO){}

    public void removeDesignation(DesignationDTO designationDTO){}

    public DesignationDTO findDesignation(Object id){return null;}

    public List<DesignationDTO> findAllDesignation(){return null;}

    public List<DesignationDTO> findRangeDesignation(int[] range){return null;}

    public int countDesignation(){return 0;}

	public DesignationDAO getDesignationDAO() {
		return designationDAO;
	}

	public void setDesignationDAO(DesignationDAO designationDAO) {
		this.designationDAO = designationDAO;
	}
    
}
