/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
       int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        do{
            System.out.print("ingresar una palabra  ");cadena = leer.nextLine();
            System.out.println(" salir = &&&&");
            
            String letra1 = cadena.substring(0,1);
            String letra2 = cadena.substring(4, 5);
            int longitud = cadena.length();
            System.out.println(letra1);
                        System.out.println(letra2);
                                                System.out.println(longitud);

 
            if ((cadena.substring(4, 5).equals("o")) & (cadena.substring(0,1).equals("x") ) & (longitud == 5)  ){
                System.out.println("correcta");
              contadorCorrectas ++; 
            } else{
                contadorIncorrectas ++;
                         System.out.println("Incorrecta");
                }
            if (cadena.equals("&&&&&") ){
            break;
            }
        }while(cadena != "&&&&&");
        
        System.out.println("la cantidad de validaciones correctas es de: "+(contadorCorrectas));
        System.out.println("la cantidad de validaciones incorrectas es de: "+(contadorIncorrectas-1));
    }
    
}
