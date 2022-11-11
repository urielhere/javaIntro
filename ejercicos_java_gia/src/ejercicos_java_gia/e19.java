/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class e19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     int [] [] matriz = new int [3][3];
     int contador = 0;
     for (int i = 0; i<3; i++){
     for (int j =0; j<3 ; j++ ){
         System.out.print("matriz ["+i+"]"+"["+j+"]"+" =");
      matriz[i][j] = leer.nextInt();
     }
     }
        System.out.println("");
        System.out.println("matriz");
      for (int i = 0; i<3; i++){
     for (int j =0; j<3 ; j++ ){
         System.out.print( matriz[i][j]  +" ");
     }
          System.out.println("");
     }
        System.out.println("----------------");
        System.out.println("matriz transpuesta");
     for (int i = 0; i<3; i++){
     for (int j =0; j<3 ; j++ ){
         System.out.print( matriz[j][i]  +" ");
     }
          System.out.println("");
     }
      for (int i = 0; i<3; i++){
     for (int j =0; j<3 ; j++ ){
        if (matriz[i][j] == (-(matriz[j][i]))){
            contador += 1; 
        }
     }
     }
      if (contador == 9){
       System.out.println("la matriz es anti simetrica");
      }
     
    }
    
}
