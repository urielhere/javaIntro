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
public class e14e {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("ingressar la cantidad de euros");
        int euros = leer.nextInt();
        System.out.println("ingresar el tipo de moneda |dolares|yenes|libras| ");
        String moneda ;
        
        moneda = leer.nextLine();
        conversion(euros,moneda);
    }
    public static int  conversion(int euros, String moneda){
       int dolares = (int) (1.28611 * euros);
       int yenes = (int) (129.852 * euros);
       int libras = (int) (0.86 * euros);
       switch (moneda){
       
           case "dolares":
              System.out.println(euros+" euros equivales a "+ dolares+" dolares");
           case "yenes":
              System.out.println(euros+" euros equivales a "+ yenes+" yenes");
           case "libras":
              System.out.println(euros+" euros equivales a "+ libras+" libras");

               

       }
        
        
        
        return 0;
    }
    
}
