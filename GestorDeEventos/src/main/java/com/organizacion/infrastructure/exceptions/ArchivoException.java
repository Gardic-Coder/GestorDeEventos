/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package main.java.com.organizacion.infrastructure.exceptions;

/**
 *
 * @author juanm
 */
public class ArchivoException extends Exception {

    /**
     * Creates a new instance of <code>ArchivoException</code> without detail
     * message.
     */
    public ArchivoException() {
    }

    /**
     * Constructs an instance of <code>ArchivoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArchivoException(String msg) {
        super(msg);
    }
}
