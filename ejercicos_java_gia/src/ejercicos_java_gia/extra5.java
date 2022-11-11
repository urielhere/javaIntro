/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar el tipo de socio(A|B|C)");
         String letra = leer.nextLine().toLowerCase();
      
         System.out.println("ingresar el monto del tratamiento");
        int tratamiento= leer.nextInt();
        
        
        switch (letra){
            case "a":
                System.out.println("el monto a pagar es "+ (tratamiento*0.5));
                
                break;
            case "b":
                                System.out.println("el monto a pagar es "+ (tratamiento-(tratamiento*0.35)));

                break;
            case "c":
                                System.out.println("el monto a pagar es "+ tratamiento);

                break;      
        }
        
        
        
        
    }
    
}
