package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author samir
 */
public class Operaciones {

    public String union(Automata automata1, Automata automata2) {
        String unionAutomatasAlfabeto = "";
        String unionAutomatasEstados = "";
        String unionEstadoFinal="";
        String unionEstadoInicial = automata1.getEstadoInicial() + automata2.getEstadoInicial();
        for (int i = 0; i < automata2.getEstados().length; i++) {
             unionEstadoFinal += automata1.getEstadoFinal() + automata2.getEstados()[i]+"-";
        }
       
        for (int i = 0; i < automata1.getAlfabeto().length; i++) {
            String letraA1 = automata1.getAlfabeto()[i];
            for (int j = 0; j < automata2.getAlfabeto().length; j++) {
                unionAutomatasAlfabeto += letraA1 + "." + automata2.getAlfabeto()[j] + " , ";

            }
        }

        for (int i = 0; i < automata1.getEstados().length; i++) {
            String letraA1 = automata1.getEstados()[i];
            for (int j = 0; j < automata2.getEstados().length; j++) {
                unionAutomatasEstados += letraA1 + "." + automata2.getEstados()[j] + " , ";

            }
        }
        String Mensaje = "";
        Mensaje = "Automatas unidos: \n" + "Automata 1: \n" + automata1.toString()
                + "\n\n"
                + "Automata 2: \n" + automata2.toString()
                + "\n\n"
                + "\nLa union de los automata es:"
                + "\nEstados: " + unionAutomatasEstados
                + "\nAlfabeto: " + unionAutomatasAlfabeto
                + "\nEstado inicial:" + unionEstadoInicial
                + "\nEstado finales: " + unionEstadoFinal;

        return Mensaje;
    }

    public String inteseccion(Automata automata1, Automata automata2) {
        String interseccionAutomatasAlfabeto = "";
        String interseccionAutomatasEstados = "";
        String interseccionEstadoInicial = automata1.getEstadoInicial() + automata2.getEstadoInicial();
        String interseccionEstadoFinal = automata1.getEstadoFinal() + automata2.getEstadoFinal();
        for (int i = 0; i < automata1.getAlfabeto().length; i++) {
            String letraA1 = automata1.getAlfabeto()[i];
            for (int j = 0; j < automata2.getAlfabeto().length; j++) {
                interseccionAutomatasAlfabeto += letraA1 + "." + automata2.getAlfabeto()[j] + " , ";

            }
        }

        for (int i = 0; i < automata1.getEstados().length; i++) {
            String letraA1 = automata1.getEstados()[i];
            for (int j = 0; j < automata2.getEstados().length; j++) {
                interseccionAutomatasEstados += letraA1 + "." + automata2.getEstados()[j] + " , ";

            }
        }
        String Mensaje = "";
        Mensaje = "Automatas interseccion: \n" + "Automata 1: \n" + automata1.toString()
                + "\n\n"
                + "Automata 2: \n" + automata2.toString()
                + "\n\n"
                + "\nLa inteseccion de los automata es:"
                + "\nEstados: " + interseccionAutomatasEstados
                + "\nAlfabeto: " + interseccionAutomatasAlfabeto
                + "\nEstado inicial:" + interseccionEstadoInicial
                + "\nEstado finales: " + interseccionEstadoFinal;

        return Mensaje;
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
        Mensaje = "Automata Operado: \n" + automata.toString()
                +"\n\n"
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
                = "Automata Operado: \n" + automata.toString()
                +"\n\n"
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
