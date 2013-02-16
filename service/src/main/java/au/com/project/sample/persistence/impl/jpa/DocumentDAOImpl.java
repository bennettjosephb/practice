/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Document;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.DocumentDAO;

/**
 *
 * @author SONY
 */
public class DocumentDAOImpl extends AbstractDAO<Document> implements DocumentDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public DocumentDAOImpl() {
        super(Document.class);
    }

    public void createDocument(Document document) {
        saveOrUpdate(document);
    }

    public void editDocument(Document document) {
        //edit(document);
    }

    public void removeDocument(Document document) {
        //remove(document);
    }

    public Document findDocument(Object id) {
        return null;//find(id);
    }

    public List<Document> findAllDocument() {
        return null;//findAll();
    }

    public List<Document> findRangeDocument(int[] range) {
        return null;// findRange(range);
    }

    public int countDocument() {
        return 0;//count();
    }

}
