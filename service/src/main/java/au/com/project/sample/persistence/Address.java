package au.com.project.sample.persistence;

import au.com.project.sample.domain.Location;

public interface Address
{
    public void createLocation(Location applicant);
    public void editLocation(Location applicant);
    public void removeLocation(Location applicant);
    public void updateSalary(Long salary, Location applicant);
    public Location findLocation(Long pKey);
    public void updateLocation(String location, Location applicant);
    public void updateLocation(String location, Long applicantId);
    public void addLocation(String location, Long applicantId);
    public void updateLocation(Location location, Long applicantId);
}
