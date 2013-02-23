/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.MaritalStatus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface MaritalStatusController {

    void createMaritalStatus(MaritalStatus maritalStatus);

    void updateMaritalStatus(MaritalStatus maritalStatus);

    void deleteMaritalStatus(MaritalStatus maritalStatus);

    MaritalStatus findMaritalStatus(Object id);

    List<MaritalStatus> findAllMaritalStatus();

    List<MaritalStatus> findRangeMaritalStatus(int[] range);

    int countMaritalStatus();

}
