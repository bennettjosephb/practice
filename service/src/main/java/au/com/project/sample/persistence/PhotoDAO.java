/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Photo;
import java.util.List;

/**
 *
 * author SONY
 */

public interface PhotoDAO {

    void createPhoto(Photo photo);

    void updatePhoto(Photo photo);

    void deletePhoto(Photo photo);

    Photo findPhoto(Object id);

    List<Photo> findAllPhoto();

    List<Photo> findRangePhoto(int[] range);

    int countPhoto();

}
