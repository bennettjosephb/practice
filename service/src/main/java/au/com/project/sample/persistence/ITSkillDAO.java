/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.ITSkill;
import java.util.List;

/**
 *
 * author SONY
 */

public interface ITSkillDAO {

	ITSkill createITSkill(ITSkill iTSkill);

    void editITSkill(ITSkill iTSkill);

    void removeITSkill(ITSkill iTSkill);

    ITSkill findITSkill(Object id);

    List<ITSkill> findAllITSkill();

    List<ITSkill> findRangeITSkill(int[] range);

    int countITSkill();

}
