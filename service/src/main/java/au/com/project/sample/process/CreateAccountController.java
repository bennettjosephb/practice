/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.domain.Address;
import au.com.project.sample.process.impl.dto.UserInfoDTO;

/**
 *
 * @author SONY
 */
public interface CreateAccountController {

    void createAccount(UserInfoDTO userInfoDTO);

    void updateAccount(UserInfoDTO userInfoDTO);

    void deleteAccount(UserInfoDTO userInfoDTO);

    UserInfoDTO findAccount(Object id);

    List<UserInfoDTO> findAllAccount();

    List<UserInfoDTO> findRange(int[] range);

    int count();

}
