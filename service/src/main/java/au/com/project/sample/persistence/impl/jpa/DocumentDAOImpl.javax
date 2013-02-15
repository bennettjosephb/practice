/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.DocumentDAOLocal;
import au.com.project.sample.domain.Document;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.DocumentDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class DocumentDAOImpl extends AbstractDAO<Document> implements DocumentDAOLocal, DocumentDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public DocumentDAOImpl() {
        super(Document.class);
    }

    public void createDocument(Document document) {
        create(document);
    }

    public void editDocument(Document document) {
        edit(document);
    }

    public void removeDocument(Document document) {
        remove(document);
    }

    public Document findDocument(Object id) {
        return find(id);
    }

    public List<Document> findAllDocument() {
        return findAll();
    }

    public List<Document> findRangeDocument(int[] range) {
        return  findRange(range);
    }

    public int countDocument() {
        return count();
    }
    
}
