/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.persistence.ApplicantDAO;
import au.com.project.sample.process.ApplicantController;

/**
 *
 * @author SONY
 */
public class ApplicantControllerImpl implements ApplicantController{
    
    private ApplicantDAO applicantDAO;

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
    public ApplicantDAO getApplicantDAO() {
        return applicantDAO;
    }

    /**
     * @param applicantDAO the applicantDAO to set
     */
    public void setApplicantDAO(ApplicantDAO applicantDAO) {
        this.applicantDAO = applicantDAO;
    }

}
