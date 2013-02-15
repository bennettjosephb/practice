/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.TotalExperience;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface TotalExperienceDAORemote {

    void createTotalExperience(TotalExperience totalExperience);

    void editTotalExperience(TotalExperience totalExperience);

    void removeTotalExperience(TotalExperience totalExperience);

    TotalExperience findTotalExperience(Object id);

    List<TotalExperience> findAllTotalExperience();

    List<TotalExperience> findRangeTotalExperience(int[] range);

    int countTotalExperience();
    
}
