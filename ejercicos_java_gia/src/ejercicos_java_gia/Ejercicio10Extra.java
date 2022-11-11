/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.extra;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10Extra {

    /**
     * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int respuesta;
        int respcorrecta;
        boolean correcto;
        correcto = false;

        int numero = (int) (Math.random() * 10);
        int numero2 = (int) (Math.random() * 10);

        System.out.println("adivine la multiplicacion entre " + (numero + " y " + numero2) + "");
        respcorrecta = numero * numero2;
        respuesta = leer.nextInt();

        if (respuesta == respcorrecta) {
            System.out.println("respuesta correcta");

        } else {
            do {
                System.out.println("respuesta incorrecta, intentelo nuevamente");
                respuesta = leer.nextInt();

            } while (respuesta != respcorrecta);


    }
}
}
    

