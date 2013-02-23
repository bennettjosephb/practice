/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.MaritalStatus;
import java.util.List;

/**
 *
 * author SONY
 */

public interface MaritalStatusDAO {

	MaritalStatus createMaritalStatus(MaritalStatus maritalStatus);

    void updateMaritalStatus(MaritalStatus maritalStatus);

    void deleteMaritalStatus(MaritalStatus maritalStatus);

    MaritalStatus findMaritalStatus(Object id);

    List<MaritalStatus> findAllMaritalStatus();

    List<MaritalStatus> findRangeMaritalStatus(int[] range);

    int countMaritalStatus();

}
