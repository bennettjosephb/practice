/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.common.exception;

/**
 *
 * @author SONY
 */
public class ApplicationException extends Exception {

    /**
     * Creates a new instance of <code>ApplicationException</code> without detail message.
     */
    public ApplicationException() {
    }

    /**
     * Constructs an instance of <code>ApplicationException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}
