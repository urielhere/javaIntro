/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
public class extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar la cantidad de numeros");
        int n = leer.nextInt();
        int u = n;
        int e = n;
        int i = n;
        int minimo = 0;
        int maximo = 0;
        int promedio = 0;
        
        int [] vector = new int[n]; 
        
        while(n>0){
            System.out.println("ingresar un numero ");
        vector[n-1] = leer.nextInt();
        if (vector[n-1]> maximo ){
        maximo = vector[n-1];
        }
       promedio += vector[n-1];
        n--;
        }
        minimo = maximo;
        while (u > 0) {
            if (vector[u-1]<minimo) {
             minimo= vector[u-1];   
            }
            u--;
        }
        System.out.println("MAXIMO");
        System.out.println(maximo);
        System.out.println("PROMEDIO");
        System.out.println(promedio / e);
        System.out.println("MINIMO");
        System.out.println(minimo);
        segundaF(vector, i);
    }
    public static void segundaF(int[] vector, int i) {

        int j = i;
        int k = i;
        int minimo;
        int maximo= 0;
        int promedio = 0;
        do {
            if (vector[i-1]>maximo) {
                maximo = vector[i-1];
            }
            promedio += vector[i-1];
            i--;
        } while (i>0);
        minimo= maximo;
        do {
            if (vector[j-1] < minimo){
                minimo = vector[j-1];
            }
            j--;
        } while (j>0);
        System.out.println("CON BUCLE DO WHILE");
           System.out.println("MAXIMO");
        System.out.println(maximo);
        System.out.println("PROMEDIO");
        System.out.println(promedio / k);
        System.out.println("MINIMO");
        System.out.println(minimo);
    }

}
