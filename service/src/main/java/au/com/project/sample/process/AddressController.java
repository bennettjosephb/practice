/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process;

import au.com.project.sample.persistence.local.*;
import au.com.project.sample.domain.Address;
import java.util.List;
import javax.ejb.Local;

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
