/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int a = leer.nextInt();
       int b = leer.nextInt();
       int c = leer.nextInt();
       int d = leer.nextInt();
       int auxiliar;
        System.out.println("A = "+  a);
        System.out.println("B = "+ b);
        System.out.println("C = "+ c);
        System.out.println("D = "+ d);
       
        auxiliar = a;
        a=d;
        d=b;
        b=c;
        c=auxiliar;
        
        auxiliar = c;
        System.out.println("---------------");
        System.out.println("A = "+  a);
        System.out.println("B = "+ b);
        System.out.println("C = "+ c);
        System.out.println("D = "+ d);
        
    }
    
}
