/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.common.exception;

/**
 *
 * @author SONY
 */
public class NewSingleton {
    
    private NewSingleton() {
    }
    
    public static NewSingleton getInstance() {
        return NewSingletonHolder.INSTANCE;
    }
    
    private static class NewSingletonHolder {

        private static final NewSingleton INSTANCE = new NewSingleton();
    }
}
