/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import au.com.project.sample.process.CreateAccountController;
import au.com.project.sample.process.impl.dto.UserInfoDTO;

/**
 *
 * @author SONY
 */
public class CreateAccountControllerImpl implements CreateAccountController{



    public void createAccount(UserInfoDTO userInfoDTO){}

    public void editAccount(UserInfoDTO userInfoDTO){}

    public void removeAccount(UserInfoDTO userInfoDTO){}

    public UserInfoDTO findAccount(Object id){return null;}

    public List<UserInfoDTO> findAllAccount(){return null;}

    public List<UserInfoDTO> findRange(int[] range){return null;}

    public int count(){return 0;}

}
