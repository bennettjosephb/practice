/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.persistence.local.ApplicantDAOLocal;
import au.com.project.sample.process.ApplicantController;
import javax.ejb.EJB;

/**
 *
 * @author SONY
 */
public class ApplicantControllerImpl implements ApplicantController{
    
    @EJB
    private ApplicantDAOLocal applicantDAO;

    public Applicant getApplicantById(Long applicantId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Applicant getApplicantByMobileNumber(String mobileNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Applicant getApplicantByUserName(String userName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the applicantDAO
     */
    public ApplicantDAOLocal getApplicantDAO() {
        return applicantDAO;
    }

    /**
     * @param applicantDAO the applicantDAO to set
     */
    public void setApplicantDAO(ApplicantDAOLocal applicantDAO) {
        this.applicantDAO = applicantDAO;
    }

}
