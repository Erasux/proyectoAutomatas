package Vista;

import Modelo.Automata;
import Modelo.JSON;
import Modelo.Operaciones;
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
        //Automata at = new Automata();
        JSON json = new JSON();
        ArrayList<Automata> automatas = json.readJSONFile();
        Operaciones opr = new Operaciones();
        JFrame jfr = new JFrame();
     

        int opc = 0;
      
    

        do {
            try {
            opc = Integer.parseInt(JOptionPane.showInputDialog(jfr,
                    "Introduzca una opcion:\n" 
                            +"1.Ver Automatas.\n" 
                            +"2.Union entre automatas\n"
                            +"3.Intereseccion entre automatas\n"
                            +"4.Complemento de un automata\n"
                            +"5.Reverso de un automata\n"
                            + "6.Salir al escritorio"));
            switch (opc) {

            case 1:
                if (automatas.size() != 0) {
                JOptionPane.showMessageDialog(jfr, "Si hay un grupo de automatas cargados en el programa.", "Información", 1);
                mostrarAutomatasIngresados(jfr, automatas);
                    }else{
                    JOptionPane.showMessageDialog(jfr, "No hay automatas en el programa", "Informacion", 0);
                }
                
                break;
                
            case 2:
                break;
            case 3:
                break;
            case 4:
                mostrarAutomatasIngresados(jfr, automatas);
                int numeroAutomataComplemento= Integer.parseInt(JOptionPane.showInputDialog(jfr,"Por favor elija un automata: "));
                 
                String mensajeComplemento= opr.complemento(automatas.get((numeroAutomataComplemento-1)));
                JOptionPane.showMessageDialog(jfr, mensajeComplemento, "Complemento", 1);
                break;
            case 5:
                mostrarAutomatasIngresados(jfr, automatas);
                int numeroAutomataReverso= Integer.parseInt(JOptionPane.showInputDialog(jfr,"Por favor elija un automata: "));
                 
                String mensajeReverso= opr.reverso(automatas.get((numeroAutomataReverso-1)));
                JOptionPane.showMessageDialog(jfr, mensajeReverso, "Reverso", 1);
                break;
            case 6:
                JOptionPane.showMessageDialog(jfr, "Saliendo...", "Salida escritorio", 1);
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(jfr,
                        "Ingresó un valor no reconocido por el sistema intentelo nuevamente.");
                break;

            }
            }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(jfr,
                        "Ingresó un valor no reconocido por el sistema intentelo nuevamente.");
}
        } while (opc != 6);

    }

    public static void mostrarAutomatasIngresados(JFrame jfr,ArrayList<Automata> automatas){
                String completo="";
                int i=1;
                for (Automata automata : automatas) {
                    completo+= "Automata " +i +": \n"+automata.toString()+"\n";
                    i++;
        } JOptionPane.showMessageDialog(jfr,completo , "Automatas ", 1);
    
    
    }
}
