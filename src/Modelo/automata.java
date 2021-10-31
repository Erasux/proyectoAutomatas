package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samir
 */
public class Automata {

    private String[] estados;
    private String[] alfabeto;
    private String estadoInicial;
    private String estadoFinal;
    private List<ArrayList> Transiciones;

    public Automata(String[] estados, String[] alfabeto, String estadoInicial, String estadoFinal,
            List<ArrayList> Transiciones) {
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.estadoInicial = estadoInicial;
        this.estadoFinal = estadoFinal;
        this.Transiciones = Transiciones;
    }

    public Automata() {
        this.estados = null;
        this.alfabeto = null;
        this.estadoInicial = "";
        this.estadoFinal = "";
        this.Transiciones = null;
    }

    public String[] getEstados() {
        return estados;
    }

    public void setEstados(String[] estados) {
        this.estados = estados;
    }

    public String[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String[] alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public String getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(String estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public List getTransiciones() {
        return Transiciones;
    }

    public void setTransiciones(ArrayList Transiciones) {
        this.Transiciones = Transiciones;
    }

    public boolean buscarEstado(String[] estados, String estadoBuscado) {
        boolean temp = false;
        for (int i = 0; i < estados.length; i++) {
            if (estadoBuscado.equals(estados[i])) {
                temp = true;
            }

        }
        return temp;
    }

    public String recorrerArreglo(String[] valores) {
        String valoresTexto = "";
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] != null) {
                valoresTexto += valores[i] + "-";
            }
        }
        return valoresTexto;
    }

    public String recorrerLista(List<String[]> valores) {
        String valoresTexto = "";
        for (int i = 0; i < valores.size(); i++) {
            String[] transicion = valores.get(i);
            valoresTexto += "[" + transicion[0] + "," + transicion[1] + "," + transicion[2] + "]" + "-";

        }
        return valoresTexto;
    }

    @Override
    public String toString() {
        String estadosTexto = recorrerArreglo(getEstados());

        String alfabetoTexto = recorrerArreglo(getAlfabeto());

        String todo = "Estados:" + estadosTexto + "\nAlfabeto: " + alfabetoTexto + "\nEstado Inicial: "
                + getEstadoInicial() + "\n Estado Final: " + getEstadoFinal() + "\nTransiciones: " + getTransiciones();

        return todo; // To change body of generated methods, choose Tools | Templates.
    }

}
