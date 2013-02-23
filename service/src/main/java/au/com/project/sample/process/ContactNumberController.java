/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.phonenumber.ContactNumber;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface ContactNumberController {

    void createContactNumber(ContactNumber contactNumber);

    void updateContactNumber(ContactNumber contactNumber);

    void deleteContactNumber(ContactNumber contactNumber);

    ContactNumber findContactNumber(Object id);

    List<ContactNumber> findAllContactNumber();

    List<ContactNumber> findRangeContactNumber(int[] range);

    int countContactNumber();

}
