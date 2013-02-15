package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.Location;
import javax.ejb.Local;

@Local
public interface ApplicantDAOLocal
{
    public void createApplicant(Applicant applicant);
    public void editApplicant(Applicant applicant);
    public void removeApplicant(Applicant applicant);
    public void updateSalary(Long salary, Applicant applicant);    
    public Applicant findCabin(Long pKey);
    public void updateLocation(String location, Applicant applicant);
    public void updateLocation(String location, Long applicantId);
    public void addLocation(String location, Long applicantId);
    public void updateLocation(Location location, Long applicantId);
}
