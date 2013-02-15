/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.CoverLetterDAOLocal;
import au.com.project.sample.domain.CoverLetter;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.CoverLetterDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class CoverLetterDAOImpl extends AbstractDAO<CoverLetter> implements CoverLetterDAOLocal,CoverLetterDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CoverLetterDAOImpl() {
        super(CoverLetter.class);
    }

    public void createCoverLetter(CoverLetter coverLetter) {
        create(coverLetter);
    }

    public void editCoverLetter(CoverLetter coverLetter) {
        edit(coverLetter);
    }

    public void removeCoverLetter(CoverLetter coverLetter) {
        remove(coverLetter);
    }

    public CoverLetter findCoverLetter(Object id) {
        return find(id);
    }

    public List<CoverLetter> findAllCoverLetter() {
        return findAll();
    }

    public List<CoverLetter> findRangeCoverLetter(int[] range) {
        return findRange(range);
    }

    public int countCoverLetter() {
        return count();
    }
    
}
