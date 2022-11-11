/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class e13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero entero para dimensionar una cuadrado: ");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i>0)&&(j>0)&&(i<n-1)&&(j<n-1)){
                    System.out.print(" ");
                }
                else{System.out.print("*");}
                
            }
            System.out.println("");
            
        }
    }

        
        
        /* Scanner leer  = new Scanner(System.in);
     
        System.out.println("ingreasr la dimension del cuadrado");
        int dimension = leer.nextInt();
        int i;
        for ( i = 0; i < dimension;i++){
            for (int j = 0; j < dimension;j++ ){
                if( i > 1 && i < dimension-1 && j > 1 && j < dimension-1){
                    System.out.print(" ");    
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }*/
    
    
    
}
