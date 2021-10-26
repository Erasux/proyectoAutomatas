package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author samir
 */
public class Operaciones {

    public void union(ArrayList<Automata> automata1, ArrayList<Automata> automata2) {
    }

    public void inteseccion(ArrayList<Automata> automata1, ArrayList<Automata> automata2) {
    }

    public String complemento(Automata automata) {
        String Mensaje = "";
        String estadoFinal = automata.getEstadoFinal();
        String[] estados = automata.getEstados();
        String[] nuevosEstadosFinales = new String[estados.length];

        for (int i = 0; i < estados.length; i++) {
            if (!estadoFinal.equals(estados[i])) {
                nuevosEstadosFinales[i] = estados[i];

            }

        }
        Mensaje = "El complemento del automata es:"
                + "\nEstado inicial:" + automata.getEstadoInicial()
                + "\nEstado finales: " + automata.recorrerArreglo(nuevosEstadosFinales)
                + "\nEstados: " + automata.recorrerArreglo(automata.getEstados())
                + "\nAlfabeto: " + automata.recorrerArreglo(automata.getAlfabeto())
                + "\nTransiciones: " + automata.getTransiciones();
        return Mensaje;
    }

    public void reverso(Automata automata) {
    }

    public void completar(ArrayList<Automata> automata) {

    }
}
