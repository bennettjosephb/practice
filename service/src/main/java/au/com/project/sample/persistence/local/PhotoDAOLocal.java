/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.Photo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface PhotoDAOLocal {

    void createPhoto(Photo photo);

    void editPhoto(Photo photo);

    void removePhoto(Photo photo);

    Photo findPhoto(Object id);

    List<Photo> findAllPhoto();

    List<Photo> findRangePhoto(int[] range);

    int countPhoto();
    
}
