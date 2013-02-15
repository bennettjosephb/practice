/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

	void editState(StateDTO stateDTO);

	void removeState(StateDTO stateDTO);

	StateDTO findState(Object id);

	List<StateDTO> findAllStates();

	List<StateDTO> findRange(int[] range);

	int count();

}
