/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.Applicant;

/**
 *
 * @author SONY
 */
public interface ApplicantController {
    
    Applicant getApplicantById(Long applicantId);
    Applicant getApplicantByMobileNumber(String mobileNumber);
    Applicant getApplicantByUserName(String userName);
    
    
}
