/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public Object getTransiciones() {
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

 
    @Override
    public String toString() {
        String estadosTexto = "";
        for (int i = 0; i < getEstados().length; i++) {
            if (getEstados()[i] != null) {
                estadosTexto += getEstados()[i] + "-";
            }
        }
        String alfabetoTexto = "";
        for (int i = 0; i < getAlfabeto().length; i++) {
            if (getAlfabeto()[i] != null) {
                alfabetoTexto += getAlfabeto()[i] + "-";
            }
        }

        String todo = "Estados:" + estadosTexto + "\nAlfabeto: " + alfabetoTexto + "\nEstado Inicial: "
                + getEstadoInicial() + "\n Estado Final: " + getEstadoFinal();

        return todo; // To change body of generated methods, choose Tools | Templates.
    }

}
