/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Photo;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.PhotoDAO;

/**
 *
 * @author SONY
 */
public class PhotoDAOImpl extends AbstractDAO<Photo> implements PhotoDAO {
 	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public PhotoDAOImpl() {
        super(Photo.class);
    }

    public void createPhoto(Photo photo) {
        saveOrUpdate(photo);
    }

    public void editPhoto(Photo photo) {
 //       edit(photo);
    }

    public void removePhoto(Photo photo) {
 //       remove(photo);
    }

    public Photo findPhoto(Object id) {
        return null;//find(id);
    }

    public List<Photo> findAllPhoto() {
        return null;//findAll();
    }

    public List<Photo> findRangePhoto(int[] range) {
        return null;//findRange(range);
    }

    public int countPhoto() {
        return 0;//count();
    }

}
