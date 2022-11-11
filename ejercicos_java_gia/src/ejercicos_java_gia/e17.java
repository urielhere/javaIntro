/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class e17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar la dimension del vector");
        int n = leer.nextInt();
        int [] vector = new int[n];
        int unDigito = 0; 
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        for (int i = 0; i<n; i++){
            System.out.println("ingresar el numero "+ (i+1));
            vector[i] = leer.nextInt();
            
        }
       
          for (int i = 0; i<n; i++){
           String num = String.valueOf(vector[i]);
           switch (num.length()){
               case 1:
                    unDigito += 1; 
                    System.out.println(vector[i]+" tiene 1 digito ");
                    break;
               case 2:
                   dosDigitos += 1;
                   System.out.println(vector[i]+" tiene 2 digito ");

                   break;
               case 3: 
                   tresDigitos += 1;
                   System.out.println(vector[i]+" tiene 3 digito ");

                   break;
               case 4:
                   cuatroDigitos += 1;
                    System.out.println(vector[i]+" tiene 4 digito ");

               case 5:
                   cincoDigitos += 1 ;
                   System.out.println(vector[i]+" tiene 5 digito ");
                   break;
                  
                    
           }
            
         
        }
          System.out.println("hay "+unDigito+" numeros con 1 digito");
          System.out.println("hay "+dosDigitos+" numeros con 2 digito");
          System.out.println("hay "+tresDigitos+" numeros con 3 digito");
          System.out.println("hay "+cuatroDigitos+" numeros con 4 digito");
          System.out.println("hay "+cincoDigitos+" numeros con 5 digito");

          
                              
    }
}
