/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samir
 */
public class automata {

    private String[] estados;
    private String[] alfabeto;
    private String estadoInicial;
    private String[] estadoFinal;
    private String[][] Transiciones;

    public automata(String[] estados, String[] alfabeto, String estadoInicial, String[] estadoFinal, String[][] Transiciones) {
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.estadoInicial = estadoInicial;
        this.estadoFinal = estadoFinal;
        this.Transiciones = Transiciones;
    }

    public automata() {
        this.estados = null;
        this.alfabeto = null;
        this.estadoInicial = "";
        this.estadoFinal = null;
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

    public String[] getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(String[] estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public String[][] getTransiciones() {
        return Transiciones;
    }

    public void setTransiciones(String[][] Transiciones) {
        this.Transiciones = Transiciones;
    }

    public static void ingresarAutomata() {
        String[][] automatas;
        boolean opc = true;
        do {
            System.out.println("Por favor ingresar estados del automata:");
        } while (opc == true);

        System.out.println("Por favor ingresar alfabeto del automata");
        System.out.println("Por favor ingresar nombre del estado inicial del automata");
        System.out.println("Por favor ingresar nombre del estado final del automata");
        System.out.println("Por favor ingresar Transiciones del automata");

    }

}
