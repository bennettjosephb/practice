/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.StateDTO;

/**
 *
 * @author SONY
 */
public interface StateController {

	void createState(StateDTO stateDTO);

	void updateState(StateDTO stateDTO);

	void deleteState(StateDTO stateDTO);

	StateDTO findState(Object id);

	List<StateDTO> findAllStates();

	List<StateDTO> findRange(int[] range);

	int count();

}
