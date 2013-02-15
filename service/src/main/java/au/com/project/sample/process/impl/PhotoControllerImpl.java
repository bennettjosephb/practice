/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Photo;
import au.com.project.sample.process.PhotoController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class PhotoControllerImpl  implements PhotoController{

    public void createPhoto(Photo photo){}

    public void editPhoto(Photo photo){}

    public void removePhoto(Photo photo){}

    public Photo findPhoto(Object id){return null;}

    public List<Photo> findAllPhoto(){return null;}

    public List<Photo> findRangePhoto(int[] range){return null;}

    public int countPhoto(){return 0;}
    
}
