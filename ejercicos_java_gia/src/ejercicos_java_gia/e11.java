/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
  
public class e11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      menu();  
    }
    public static void  menu(){
      Scanner leer = new Scanner(System.in);
      int opcion;
      int num1;
      int num2;
      
      do{
        
        System.out.println("MENU");
        System.out.println("1.sumar"); 
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        System.out.print("Elija una pocion: ");
        opcion = leer.nextInt();
        if (opcion == 5){
        break;
        }
          System.out.println("ingrear numero 1");
          num1 = leer.nextInt();
          System.out.println("ingrear numero 2");
          num2 = leer.nextInt();
          System.out.println("-------------------------");
           switch(opcion){
               case 1:
                   sumar(num1, num2);
                  break;
               case 2:
                   restar(num1,num2);
                   break;
               case 3:
                   multiplicar(num1,num2);
                   break;
               case 4:
                   dividir(num1,num2);
                   break;
                   
           }     
      }while(opcion != 5);
  
        
      
    }
    public static void sumar(int num1, int num2){
        System.out.println("el resultado de la suma entre: "+num1+" y "+num2+" es de: "+(num2+num1));
    }
    public static void restar(int num1, int num2){
        if (num1 < num2){
            System.out.println("el resultado de la resta es de:"+(num2-num1));
            
            }else{
             System.out.println("el resultado de la resta es de:"+(num1-num2));
        }
    }
     public static void multiplicar(int num1, int num2){
        System.out.println("el resultado de la multiplicacion entre: "+num1+" y "+num2+" es de: "+(num2*num1));
    }
      public static void dividir(int num1, int num2){
        if (num1 < num2){
            System.out.println("el resultado de la division es de:"+(num2/num1));
            
            }else{
             System.out.println("el resultado de la division es de:"+(num1/num2));
        }
    }
}
