/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
public class e16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingresar el tamaño del vector: ");
        int n = leer.nextInt();
        int [] vector = new int [n];
        int repeticiones = 0;
        int num;
        for ( int i = 0 ; i < n; i++){
        vector [i] = (int) (Math.random()*10);
        }
        System.out.print("VECTOR: ");
            for ( int i = 0 ; i < n; i++){
                System.out.print(vector[i]+", ");
        }     
        System.out.println("");
        System.out.println("ingresar un numero a busacar en el vector: ");
          num = leer.nextInt();
        for ( int i = 0 ; i < n; i++){
              if (num == vector[i]){
                  System.out.println("el numero se encuentra en la posicion "+i);
                  repeticiones += 1;
              }
        }   
        
        if (repeticiones == 0 ){
            System.out.println("el numero no se encontro en el vector");
        }else{
            System.out.println("el numero se encontro "+ repeticiones+" veces en el vector");
        }
    }
    
}
