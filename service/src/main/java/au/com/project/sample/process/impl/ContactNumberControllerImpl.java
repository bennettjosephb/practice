/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.phonenumber.ContactNumber;
import au.com.project.sample.process.ContactNumberController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class ContactNumberControllerImpl  implements ContactNumberController{

    public void createContactNumber(ContactNumber contactNumber){}

    public void editContactNumber(ContactNumber contactNumber){}

    public void removeContactNumber(ContactNumber contactNumber){}

    public ContactNumber findContactNumber(Object id){return null;}

    public List<ContactNumber> findAllContactNumber(){return null;}

    public List<ContactNumber> findRangeContactNumber(int[] range){return null;}

    public int countContactNumber(){return 0;}
    
}
