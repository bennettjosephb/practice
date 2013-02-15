/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.temp;

import au.com.project.sample.domain.TotalExperience;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class TotalExperienceFacade extends AbstractFacade<TotalExperience> implements TotalExperienceFacadeLocal {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TotalExperienceFacade() {
        super(TotalExperience.class);
    }
    
}
