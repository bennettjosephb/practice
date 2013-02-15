/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.common.exception;

/**
 *
 * @author SONY
 */
public class SystemException extends ApplicationException {

    /**
     * Creates a new instance of <code>TechnicalException</code> without detail message.
     */
    public SystemException() {
    }

    /**
     * Constructs an instance of <code>TechnicalException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public SystemException(String msg) {
        super(msg);
    }
}
