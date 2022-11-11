/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class e20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
             int [] [] matriz = new int [3][3];
             int [] filas = new int [3];
             int [] columnas = new int [3];
             int d =0;
             int f = 0;
             int c = 0;
       for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
           System.out.print("matriz ["+i+"]"+" "+"["+j+"]"+"=");
           matriz[i][j] = leer.nextInt();
           while(matriz[i][j]<0 || matriz[i][j] > 9 ){
               System.out.println("el numero ingresado esta fuera del rango permitido, intentar nuevamente");
                System.out.print("matriz ["+i+"]"+" "+"["+j+"]"+"=");
           matriz[i][j] = leer.nextInt();
           }
           }
       }
       
        for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                 
                 if(i == j){
                   d += matriz[i][j] ;   
                }
           }
       }
      
        for (int i = 0 ; i<3 ; i++){
           for(int j = 0 ; j<3 ; j++){
            
             filas[i] += matriz[i][j];
                
           }
       }
       for (int i = 1 ; i<3 ;i++){
            f = filas[0];
          if (f == filas[i]){
          f = filas[i];
              
          }else{
          f = 0;
          }
       }
        for (int i = 0 ; i<3 ; i++){
           for(int j = 0 ; j<3 ; j++){
            
             columnas[i] += matriz[j][i];
                
           }
       }
          for (int i = 1 ; i<3 ;i++){
                c = columnas[0];
          if (c == columnas[i]){
          c = columnas[i];
              
          }else{
          c = 0;
          }
       }
        
      if (d == f && d == c){
          System.out.println("la matriz es magica");
      }else{
          System.out.println("la matriz no es magica");
      }
        
    }
}
