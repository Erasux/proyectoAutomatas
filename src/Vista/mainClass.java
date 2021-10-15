package Vista;

import Modelo.automata;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author samir
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        automata at = new automata();
        int opc = 1000;
        do {
            System.out.println("Por favor ingresar una opcion.");

            switch (opc) {
                case 1: 
                    System.out.println("1.Ingresar primer automata");
                    at.ingresarAutomata();
                    break;
                case 2:
                    System.out.println("2.Ingresar segundo automata");
                    break;
                case 3:
                    System.out.println("3.Operar con automatas");
                    break;
                case 4:
                    System.out.println("4.Ver automatas");
                case 5:
                    System.out.println("5.Salir del sistema");
            }

        } while (opc != 5);
    }

}
