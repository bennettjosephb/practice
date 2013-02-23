/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.Photo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface PhotoController {

    void createPhoto(Photo photo);

    void updatePhoto(Photo photo);

    void deletePhoto(Photo photo);

    Photo findPhoto(Object id);

    List<Photo> findAllPhoto();

    List<Photo> findRangePhoto(int[] range);

    int countPhoto();

}
