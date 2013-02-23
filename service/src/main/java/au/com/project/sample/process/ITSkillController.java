/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.ITSkillDTO;

/**
 *
 * @author SONY
 */
public interface ITSkillController {

	ITSkillDTO createITSkill(ITSkillDTO iTSkillDTO);

	ITSkillDTO updateITSkill(ITSkillDTO iTSkillDTO);

    void deleteITSkill(ITSkillDTO iTSkillDTO);

    ITSkillDTO findITSkill(Object id);

    List<ITSkillDTO> findAllITSkill();

    List<ITSkillDTO> findRangeITSkill(int[] range);

    int countITSkill();

}
