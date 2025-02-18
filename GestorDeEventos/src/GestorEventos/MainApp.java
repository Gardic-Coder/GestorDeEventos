
package GestorEventos;
import main.java.com.organizacion.infrastructure.gui.MainWindow;
/**
 *
 * @author juanm
 */
public class MainApp {
//Mensaje de Alejandro
//MainWindows parece tener otro tipo de main, que se compila de manera predeterminada. No se si esta parte del codigo quedo obsoleta

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MainWindow paginainicial = new MainWindow();
         paginainicial.setVisible(true);
         paginainicial.setLocationRelativeTo(null);
         
    }
    
}
