/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.ITSkillDAOLocal;
import au.com.project.sample.domain.ITSkill;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.ITSkillDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class ITSkillDAOImpl extends AbstractDAO<ITSkill> implements ITSkillDAOLocal, ITSkillDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public ITSkillDAOImpl() {
        super(ITSkill.class);
    }

    public void createITSkill(ITSkill iTSkill) {
        create(iTSkill);
    }

    public void editITSkill(ITSkill iTSkill) {
        edit(iTSkill);
    }

    public void removeITSkill(ITSkill iTSkill) {
        remove(iTSkill);
    }

    public ITSkill findITSkill(Object id) {
        return find(id);
    }

    public List<ITSkill> findAllITSkill() {
        return findAll();
    }

    public List<ITSkill> findRangeITSkill(int[] range) {
        return findRange(range);
    }

    public int countITSkill() {
        return count();
    }
    
}
