/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
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

    void updateAddress(Address address);

    void deleteAddress(Address address);

    Address findAddress(Object id);

    List<Address> findAllAddress();

    List<Address> findRange(int[] range);

    Long count();

}
