/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package main.java.exceptions;

/**
 *
 * @author juanm
 */
public class EventoNoEncontradoException extends Exception {

    /**
     * Creates a new instance of <code>EventoNoEncontradoException</code>
     * without detail message.
     */
    public EventoNoEncontradoException() {
    }

    /**
     * Constructs an instance of <code>EventoNoEncontradoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public EventoNoEncontradoException(String msg) {
        super(msg);
    }
}
