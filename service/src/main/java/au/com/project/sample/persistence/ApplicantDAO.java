package au.com.project.sample.persistence;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.Location;


public interface ApplicantDAO
{
    public Applicant createApplicant(Applicant applicant);
    public void editApplicant(Applicant applicant);
    public void removeApplicant(Applicant applicant);
    public void updateSalary(Long salary, Applicant applicant);
    public Applicant findApplicant(Long pKey);
    public void updateLocation(String location, Applicant applicant);
    public void updateLocation(String location, Long applicantId);
    public void addLocation(String location, Long applicantId);
    public void updateLocation(Location location, Long applicantId);
}
