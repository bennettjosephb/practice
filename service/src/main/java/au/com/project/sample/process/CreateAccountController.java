/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    void editAccount(UserInfoDTO userInfoDTO);

    void removeAccount(UserInfoDTO userInfoDTO);

    UserInfoDTO findAccount(Object id);

    List<UserInfoDTO> findAllAccount();

    List<UserInfoDTO> findRange(int[] range);

    int count();

}
