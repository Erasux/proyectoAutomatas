package Vista;

import Modelo.Automata;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author samir
 */
public class mainClass {

    public static void main(String[] args) {
        // TODO code application logic here

        Automata at = new Automata();
        ArrayList<Automata> automatas = new ArrayList<Automata>();
        int opc = 1000;
        boolean salida;
        JFrame jfr = new JFrame();
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(jfr, "Introduzca una opcion:\n"
                    + "1.Ingresar 1° automata\n"
                    + "2.Ingresar 2° automata\n"
                    + "3.Operaciones con automatas\n"
                    + "4.Ver automatas\n"
                    + "5.Salir al escritorio"));
            switch (opc) {

              /*  case 1:
                    int variable;
                    int i = 0;
                    //Abecedario
                    JOptionPane.showMessageDialog(jfr, "Ingrese las letras del abecedario", "Abecedario", 2);

                    String alfabetovacio[] = new String[10];
                    do {
                        alfabetovacio[i] = JOptionPane.showInputDialog(jfr, "Ingresar la letra del alfabeto: ");
                        at.setAlfabeto(alfabetovacio);
                        JOptionPane.showMessageDialog(jfr, at.getAlfabeto());
                        variable = JOptionPane.showConfirmDialog(jfr, "Desea agregar otra letra al alfabeto?");
                        i++;
                    } while (0 == variable);
                    i = 0;
                    //Estados
                    JOptionPane.showMessageDialog(jfr, "Ingrese los estados del automata.", "Estados", 2);

                    String estadosvacio[] = new String[10];
                    do {
                        estadosvacio[i] = JOptionPane.showInputDialog(jfr, "Ingresar el estado del automata: ");
                        at.setEstados(estadosvacio);
                        JOptionPane.showMessageDialog(jfr, at.getEstados());
                        variable = JOptionPane.showConfirmDialog(jfr, "Desea agregar otro estado al automata?");
                        i++;
                    } while (0 == variable);
                    i = 0;
                    //Estados Finales
                    JOptionPane.showMessageDialog(jfr, "Ingrese los estados finales del automata.", "Estados finales", 2);

                    String estadosFinVacio[] = new String[10];
                    do {
                        estadosFinVacio[i] = JOptionPane.showInputDialog(jfr, "Ingresar el estado final del automata: ");
                        if (at.buscarEstado(at.getEstados(), estadosFinVacio[i])) {
                            JOptionPane.showMessageDialog(jfr, "Se ha agregado el estado final.");
                            at.setEstadoFinal(estadosFinVacio);
                            JOptionPane.showMessageDialog(jfr, at.getEstadoFinal());
                            i++;
                        } else {
                            estadosFinVacio[i] = null;
                            JOptionPane.showMessageDialog(jfr, "No se ha encontrado el estado deseado en el automata.");
                            JOptionPane.showMessageDialog(jfr, at.getEstadoFinal());
                        }

                        variable = JOptionPane.showConfirmDialog(jfr, "Desea agregar otro estado final al automata?");

                    } while (0 == variable);
                    i = 0;
                    JOptionPane.showMessageDialog(jfr, at.toString());

                    break;*/

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
                    JOptionPane.showMessageDialog(jfr, "Ingresó un valor no reconocido por el sistema intentelo nuevamente.");
                    break;

            }

        } while (opc != 5);

    }

}
