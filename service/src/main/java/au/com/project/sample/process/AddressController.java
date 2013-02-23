/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.domain.Address;

/**
 *
 * @author SONY
 */
public interface AddressController {

    void createAddress(Address address);

    void updateAddress(Address address);

    void deleteAddress(Address address);

    Address findAddress(Object id);

    List<Address> findAllAddress();

    List<Address> findRange(int[] range);

    int count();

}
