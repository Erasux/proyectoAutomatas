package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author samir
 */
public class Operaciones {

    public void union(Automata automata1, Automata automata2) {
        String unionAutomatasAlfabeto = "";
        String unionEstadoInicial=automata1.getEstadoInicial()+automata2.getEstadoInicial();
        String unionEstadoFinal=automata1.getEstadoFinal()+automata2.getEstadoFinal();
        for (int i = 0; i <automata1.getAlfabeto().length; i++) {
            String letraA1=automata1.getAlfabeto()[i];
            for (int j = 0; j < automata2.getAlfabeto().length; j++) {
                unionAutomatasAlfabeto += letraA1+automata2.getAlfabeto()[i];
                
            }
        }
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
        Mensaje  = "Automata Operado: \n"+automata.toString()
                + "\nEl complemento del automata es:"
                + "\nEstados: " + automata.recorrerArreglo(automata.getEstados())
                + "\nAlfabeto: " + automata.recorrerArreglo(automata.getAlfabeto())
                
                + "\nEstado inicial:" + automata.getEstadoInicial()
                + "\nEstado finales: " + automata.recorrerArreglo(nuevosEstadosFinales)
                
                
                + "\nTransiciones: " + automata.getTransiciones();
        return Mensaje;
    }

    public String reverso(Automata automata) {
        String Mensaje = "";
        List<Automata> transiciones = automata.getTransiciones();
        List<String[]> transicionesReverso = new ArrayList<>();
        for (int i = 0; i < automata.getTransiciones().size(); i++) {
            ArrayList transicion = (ArrayList) automata.getTransiciones().get(i);
            String[] transicionReversa = new String[3];
            transicionReversa[0] = (String) transicion.get(1);
            transicionReversa[1] = (String) transicion.get(0);
            transicionReversa[2] = (String) transicion.get(2);
            transicionesReverso.add(transicionReversa);
        }
        Mensaje
                = "Automata Operado: \n"+automata.toString() 
                + "\nEl Reverso del automata es:"
                + "\nEstados: " + automata.recorrerArreglo(automata.getEstados())
                 + "\nAlfabeto: " + automata.recorrerArreglo(automata.getAlfabeto())
                + "\nEstado inicial:" + automata.getEstadoFinal()
                + "\nEstado final: " + automata.getEstadoInicial()
                
               
                + "\nTransiciones: " + automata.recorrerLista(transicionesReverso);
        return Mensaje;

    }

    public void completar(ArrayList<Automata> automata) {

    }
}
