/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Certification;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CertficationDAO;

/**
 *
 * @author SONY
 */
public class CertficationDAOImpl extends AbstractDAO<Certification> implements CertficationDAO {

	private SessionFactory sessionFactory;

    public CertficationDAOImpl() {
        super(Certification.class);
    }

    public void createCertfication(Certification certfication) {
        saveOrUpdate(certfication);
    }

    public void updateCertfication(Certification certfication) {
//        update(certfication);
    }

    public void deleteCertfication(Certification certfication) {
//        delete(certfication);
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
