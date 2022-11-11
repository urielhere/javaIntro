/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("ingresar la cantidad de personas");
        int n = leer.nextInt();
        double [] altura  = new double[n];
        int petisos = 0;
        double promedio = 0;

        for(int i = 0; i< n;i++ ){
            System.out.println("ingresar la altura de la persona "+i+1);
            altura[i] = leer.nextDouble();
            
        }
        for(int i= 0; i<n;i++){
             if (altura[i]< 1.60){
             petisos += 1; 
             }
             promedio += altura[i];
        }    
        System.out.println("la altura pomedio de petisos es de %"+(petisos*100)/n);
        
        System.out.println("la altura pomedio de alturas es de "+promedio/n);
        
        
    }
    
}
