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

import org.hibernate.SessionFactory;

/**
 *
 * @author SONY
 */
public class CertficationDAOImpl extends AbstractDAO<Certification> implements CertficationDAOLocal, CertficationDAORemote {

	private SessionFactory sessionFactory;

    public CertficationDAOImpl() {
        super(Certification.class);
    }

    public void createCertfication(Certification certfication) {
        saveOrUpdate(certfication);
    }

    public void editCertfication(Certification certfication) {
//        edit(certfication);
    }

    public void removeCertfication(Certification certfication) {
//        remove(certfication);
    }

    public Certification findCertfication(Object id) {
        return null;//find(id);
    }

    public List<Certification> findAllCertfication() {
        return null;//findAll();
    }

    public List<Certification> findRangeCertfication(int[] range) {
        return null;//findRange(range);
    }

    public int countCertfication() {
        return 0;//count();
    }

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
