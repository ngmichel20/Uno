package model;

/**
 *
 * @author Michel
 */
public class UnoException extends Exception {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public UnoException() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UnoException(String msg) {
        super(msg);
    }
}
