/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanasemergentes;
import java.awt.Color; //Defino colores personalizados (Tecnologia Hover)
import javax.swing.JButton; //Me permitira utilizar manualmente Jbutton
/**
 *
 * @author Alejandrito
 */
public class herramientasVentanas {
    public static void cambiarColor(JButton boton, boolean eventoentered){ //Una funcion que me permitira alterar los colores de un boton, dependiendo de la entrada o salida de un boton
        if (eventoentered){ //Si el mouse entro en el radio del boton
            boton.setBackground (new Color(255, 151, 151)); //Cambiar el color del fondo
            boton.setForeground (new Color (255,255,255)); //Cambiar el color del texto
        }else{ //si no...
            boton.setBackground (new Color(252,186,186));
            boton.setForeground (new Color(0,0,0));            
        }
    }
}
