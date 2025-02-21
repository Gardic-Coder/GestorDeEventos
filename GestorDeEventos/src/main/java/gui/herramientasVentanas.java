/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.gui;
import java.awt.Color; //Defino colores personalizados (Tecnologia Hover)
import javax.swing.JButton; //Me permitira utilizar manualmente Jbutton
import javax.swing.JTextField;
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
        //Vacia el campo de texto, y cambia el color a Negro
    public static void campovacio(JTextField campo, String mensaje, boolean color){
        campo.setText(mensaje);
        if (color){
            campo.setForeground (Color.black);  
        }else{
            campo.setForeground (Color.gray);
        }  
    }
    
    public static void validarCampoprincipal(JTextField campo, String textopredeterminado, JTextField... otrosCampos){
        if (campo.getText().equals(textopredeterminado)) { //El campo presionado, se verifica con su texto predeterminado
            herramientasVentanas.campovacio(campo, "", true);
        }
        for (JTextField otroCampo : otrosCampos) { //Para los demas campos
            if (otroCampo.getText().isEmpty()) {//Si no estan vacios, no se alteran; en caso contrario, se les brinda su mensaje predeterminado
                String mensaje = "";//En Java, la gestión de memoria para objetos como String se maneja automáticamente mediante el recolector de basura
                if (otroCampo.getName().equals("camponombre")) {
                    mensaje = "Nombre de la Persona";
                } else if (otroCampo.getName().equals("campocedula")) {
                    mensaje = "Cedula de Identidad";
                } else if (otroCampo .getName().equals("campocorreo")) {
                    mensaje = "Correo personal";
                } else if (otroCampo.getName().equals("campotlf")){
                    mensaje = "Nro. Personal";   
                }
                herramientasVentanas.campovacio(otroCampo, mensaje, false);
            }
        }
    }
}
