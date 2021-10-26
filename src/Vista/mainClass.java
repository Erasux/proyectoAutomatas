package Vista;

import Modelo.Automata;
import Modelo.JSON;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author samir
 */
// Clase main Juan
public class mainClass {
       

    public static void main(String[] args) {
        Automata at = new Automata();
        JSON json = new JSON();
        ArrayList<Automata> automatas = json.readJSONFile();
        boolean salida;

        JFrame jfr = new JFrame();
        if (automatas.size() != 0) {
            JOptionPane.showMessageDialog(jfr, "Automatas cargado", "Información", 1);
        }

        int opc;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(jfr,
                    "Introduzca una opcion:\n" 
                            + "1. Ver Automatas.\n" 
                            + "2.\n"
                            + "3.Operaciones con automatas\n" 
                            + "4.Ver automatas\n"
                            + "5.Salir al escritorio"));
            switch (opc) {

            case 1:
                mostrarAutomatasIngresados(jfr, automatas);
                break;
                
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                JOptionPane.showMessageDialog(jfr, "Saliendo...", "Salida escritorio", 1);
                break;
            default:
                JOptionPane.showMessageDialog(jfr,
                        "Ingresó un valor no reconocido por el sistema intentelo nuevamente.");
                break;

            }

        } while (opc != 5);

    }

    public static void mostrarAutomatasIngresados(JFrame jfr,ArrayList<Automata> automatas){
                String completo="";
                for (Automata automata : automatas) {
                    completo+= "Automata:\n"+automata.toString()+"\n";
                    
        } JOptionPane.showMessageDialog(jfr,completo , "Automatas ", 0);
    
    
    }
}
