/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.ContactNumberDAOLocal;
import au.com.project.sample.domain.phonenumber.ContactNumber;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.ContactNumberDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class ContactNumberDAOImpl extends AbstractDAO<ContactNumber> implements ContactNumberDAOLocal, ContactNumberDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactNumberDAOImpl() {
        super(ContactNumber.class);
    }

    public void createContactNumber(ContactNumber contactNumber) {
        create(contactNumber);
    }

    public void editContactNumber(ContactNumber contactNumber) {
        edit(contactNumber);
    }

    public void removeContactNumber(ContactNumber contactNumber) {
        remove(contactNumber);
    }

    public ContactNumber findContactNumber(Object id) {
        return find(id);
    }

    public List<ContactNumber> findAllContactNumber() {
        return findAll();
    }

    public List<ContactNumber> findRangeContactNumber(int[] range) {
        return findRange(range);
    }

    public int countContactNumber() {
        return count();
    }
    
}
