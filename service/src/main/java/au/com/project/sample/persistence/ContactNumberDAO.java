/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.phonenumber.ContactNumber;
import java.util.List;

/**
 *
 * author SONY
 */

public interface ContactNumberDAO {

    void createContactNumber(ContactNumber contactNumber);

    void updateContactNumber(ContactNumber contactNumber);

    void deleteContactNumber(ContactNumber contactNumber);

    ContactNumber findContactNumber(Object id);

    List<ContactNumber> findAllContactNumber();

    List<ContactNumber> findRangeContactNumber(int[] range);

    int countContactNumber();

}
