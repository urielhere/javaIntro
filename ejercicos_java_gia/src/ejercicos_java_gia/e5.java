/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class e5 {

    /**
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * @param args
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num = leer.nextInt();
       int doble = num*2;
       int triple = num*3;
       double raiz = Math.sqrt(num);
        System.out.println("el doble de "+num+" es "+doble);
                System.out.println("el triple de "+num+" es "+triple);

                        System.out.println("la raiz de "+num+" es "+raiz);

    }
    
}
