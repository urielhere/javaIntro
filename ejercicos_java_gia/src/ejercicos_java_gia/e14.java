/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class e14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     
      System.out.println("ingresar el tipo de moneda |dolares|yenes|libras| ");
        String  moneda = leer.nextLine();
        
        System.out.println("ingressar la cantidad de euros");
        int euros = leer.nextInt();
       
        
       
        conversion(euros,moneda);
    }

  
    public static void  conversion (int euros, String moneda){
       double dolares = (double) (1.28611 * euros);
       int yenes = (int) (129.852 * euros);
       int libras = (int) (0.86 * euros);
       switch (moneda){
       
           case "dolares":
              System.out.println(euros+" euros equivales a "+ dolares+" dolares");
              break;
           case "yenes":
              System.out.println(euros+" euros equivales a "+ yenes+" yenes");
              break;
           case "libras":
              System.out.println(euros+" euros equivales a "+ libras+" libras");
              break;
               

       }
        
    }
}
