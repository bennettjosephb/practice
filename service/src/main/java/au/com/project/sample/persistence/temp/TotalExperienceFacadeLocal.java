/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.temp;

import au.com.project.sample.domain.TotalExperience;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface TotalExperienceFacadeLocal {

    void create(TotalExperience totalExperience);

    void edit(TotalExperience totalExperience);

    void remove(TotalExperience totalExperience);

    TotalExperience find(Object id);

    List<TotalExperience> findAll();

    List<TotalExperience> findRange(int[] range);

    int count();
    
}
