/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_programa_java;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class hola_mundo {
     public static void main(String[] args)
      Scanner leer = new Scanner(System.in); {
      String nombre;
      System.out.println("ingresa tu numbre:");
      nombre = leer.next();
      System.out.println("hola mundo soy "+nombre+" y estoy programando en java¡! wachin");
    }
}
