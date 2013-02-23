/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.State;
import java.util.List;

/**
 *
 * author SONY
 */

public interface StateDAO {

	State createState(State state);

    void updateState(State state);

    void deleteState(State state);

    State findState(Object id);

    State findStateByCode(String c);

    List<State> findStateByName(String name);

    List<State> findAllStates();

    List<State> findRange(int[] range);

    Long count();

}
