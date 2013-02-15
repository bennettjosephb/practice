/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Address;
import java.util.List;

/**
 *
 * author SONY
 */

public interface AddressDAO {

    void createAddress(Address address);

    void editAddress(Address address);

    void removeAddress(Address address);

    Address findAddress(Object id);

    List<Address> findAllAddress();

    List<Address> findRange(int[] range);

    int count();

}
