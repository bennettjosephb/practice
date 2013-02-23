/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.TotalExperience;
import java.util.List;

/**
 *
 * author SONY
 */

public interface TotalExperienceDAO {

    void createTotalExperience(TotalExperience totalExperience);

    void updateTotalExperience(TotalExperience totalExperience);

    void deleteTotalExperience(TotalExperience totalExperience);

    TotalExperience findTotalExperience(Object id);

    List<TotalExperience> findAllTotalExperience();

    List<TotalExperience> findRangeTotalExperience(int[] range);

    int countTotalExperience();

}
