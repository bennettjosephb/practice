/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.CertficationDAOLocal;
import au.com.project.sample.domain.Certification;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.CertficationDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class CertficationDAOImpl extends AbstractDAO<Certification> implements CertficationDAOLocal, CertficationDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CertficationDAOImpl() {
        super(Certification.class);
    }

    public void createCertfication(Certification certfication) {
        create(certfication);
    }

    public void editCertfication(Certification certfication) {
        edit(certfication);
    }

    public void removeCertfication(Certification certfication) {
        remove(certfication);
    }

    public Certification findCertfication(Object id) {
        return find(id);
    }

    public List<Certification> findAllCertfication() {
        return findAll();
    }

    public List<Certification> findRangeCertfication(int[] range) {
        return findRange(range);
    }

    public int countCertfication() {
        return count();
    }
    
}
