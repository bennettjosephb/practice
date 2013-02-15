/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.PhotoDAOLocal;
import au.com.project.sample.domain.Photo;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.PhotoDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class PhotoDAOImpl extends AbstractDAO<Photo> implements PhotoDAOLocal, PhotoDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public PhotoDAOImpl() {
        super(Photo.class);
    }

    public void createPhoto(Photo photo) {
        create(photo);
    }

    public void editPhoto(Photo photo) {
        edit(photo);
    }

    public void removePhoto(Photo photo) {
        remove(photo);
    }

    public Photo findPhoto(Object id) {
        return find(id);
    }

    public List<Photo> findAllPhoto() {
        return findAll();
    }

    public List<Photo> findRangePhoto(int[] range) {
        return findRange(range);
    }

    public int countPhoto() {
        return count();
    }
    
}
