/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package main.java.com.organizacion.domain.exceptions;

/**
 *
 * @author juanm
 */
public class ParticipanteExistenteException extends Exception {

    /**
     * Creates a new instance of <code>ParticipanteExistenteException</code>
     * without detail message.
     */
    public ParticipanteExistenteException() {
    }

    /**
     * Constructs an instance of <code>ParticipanteExistenteException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ParticipanteExistenteException(String msg) {
        super(msg);
    }
}
