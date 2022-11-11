/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar una letra");
        String letra = leer.nextLine();
        switch (letra){
            case "a":
                System.out.println("la letra "+letra+" es una vocal");
                break;
            case "e":
                System.out.println("la letra "+letra+" es una vocal");
                break;
            case "i":
                System.out.println("la letra "+letra+" es una vocal");
                break;
            case "o":
                System.out.println("la letra "+letra+" es una vocal");
                break;
            case "u":
                System.out.println("la letra "+letra+" es una vocal");
                break;    
            default:
                System.out.println("la letra "+letra+" es una consonante");
        }
        
        
    }
    
}
