/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    void editAddress(Address address);

    void removeAddress(Address address);

    Address findAddress(Object id);

    List<Address> findAllAddress();

    List<Address> findRange(int[] range);

    int count();
    
}
