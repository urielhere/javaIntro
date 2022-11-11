/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.print("ingresar un limite para la suma: ");
    int limite = leer.nextInt();
        int num;
        int suma = 0;
        
    do{
        
         num = leer.nextInt();
          suma += num;
        if (suma  < limite+1){
            System.out.println("ingresar otro numero");
        } else{
            System.out.println("la suma supero el limite");
            System.out.println("limite : "+limite+", suma : "+ suma);
        break;
        }
        
    }while(suma < limite+1);
    }
    
}
