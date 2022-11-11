/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar cantidad de minutos");
        int minutos = leer.nextInt();
         int dias = minutos/1440;
        int horas =  (minutos%1440)/60 ;
       
        System.out.println("equivale a "+horas+" horas ");
        System.out.println("equvale a "+dias+" dias");
    }
    
}
