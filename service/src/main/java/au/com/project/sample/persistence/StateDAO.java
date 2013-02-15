/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.State;
import java.util.List;

/**
 *
 * author SONY
 */

public interface StateDAO {

    void createState(State state);

    void editState(State state);

    void removeState(State state);

    State findState(Object id);

    State findStateByCode(String c);

    List<State> findStateByName(String name);

    List<State> findAllStates();

    List<State> findRange(int[] range);

    int count();

}
