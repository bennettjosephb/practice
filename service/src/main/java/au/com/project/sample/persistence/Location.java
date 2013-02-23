package au.com.project.sample.persistence;



public interface Location
{
    public void createLocation(Location applicant);
    public void updateLocation(Location applicant);
    public void deleteLocation(Location applicant);
    public void updateSalary(Long salary, Location applicant);
    public Location findLocation(Long pKey);
    public void updateLocation(String location, Location applicant);
    public void updateLocation(String location, Long applicantId);
    public void addLocation(String location, Long applicantId);
    public void updateLocation(Location location, Long applicantId);
}
