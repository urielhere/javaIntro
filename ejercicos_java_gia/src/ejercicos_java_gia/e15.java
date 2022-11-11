/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int[101];
        for (int i = 0 ; i< 101; i++){
        vector[i] = i;
        }
         for (int i = 100 ; i >= 0 ;  i--){
             System.out.println(vector[i]);
          
        }
    }
    
}
