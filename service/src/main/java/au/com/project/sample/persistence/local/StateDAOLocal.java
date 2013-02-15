/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.State;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface StateDAOLocal {

    void createState(State state);

    void editState(State state);

    void removeState(State state);

    State findState(Object id);

    List<State> findAllStates();

    List<State> findRange(int[] range);

    int count();
    
}
