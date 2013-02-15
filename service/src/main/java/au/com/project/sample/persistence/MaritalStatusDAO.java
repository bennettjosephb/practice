/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.MaritalStatus;
import java.util.List;

/**
 *
 * author SONY
 */

public interface MaritalStatusDAO {

    void createMaritalStatus(MaritalStatus maritalStatus);

    void editMaritalStatus(MaritalStatus maritalStatus);

    void removeMaritalStatus(MaritalStatus maritalStatus);

    MaritalStatus findMaritalStatus(Object id);

    List<MaritalStatus> findAllMaritalStatus();

    List<MaritalStatus> findRangeMaritalStatus(int[] range);

    int countMaritalStatus();

}
