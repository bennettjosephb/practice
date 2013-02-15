/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.common.exception;

/**
 *
 * @author SONY
 */
public class BusinessException extends ApplicationException {

    /**
     * Creates a new instance of <code>BusinessException</code> without detail message.
     */
    public BusinessException() {
    }

    /**
     * Constructs an instance of <code>BusinessException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public BusinessException(String msg) {
        super(msg);
    }
}
