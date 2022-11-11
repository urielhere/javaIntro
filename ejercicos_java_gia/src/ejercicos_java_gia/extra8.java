/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
 *
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break. */
public class extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pares  = 0;
        int impares = 0 ;
        int cantN = 0 ;
        int num = 0 ;
        while (true) {
            System.out.println("ingresar un numero");
            num = leer.nextInt();
            if (num < 0) {
                num = 0;

            } else if (num % 2 == 0) {
                pares += 1;
                cantN++;
            } else if (num % 2 != 0) {
                impares += 0;
                cantN++;

            }

        }   
        System.out.println("PARES");
        System.out.println(pares);
        System.out.println("IMPARES");
        System.out.println(impares);
        System.out.println("cantidad de numeros");
        System.out.println(cantN);
     
    }
    
}
