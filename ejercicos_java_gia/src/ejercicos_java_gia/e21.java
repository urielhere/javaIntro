/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_java_gia;

import java.util.Scanner;

/**
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
public class e21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz1 = new int [10][10];
        int[][] matriz2 = new int [3][3];
        int [] fila1 = new int [3];
        int [] fila2 = new int [3];
        int [] fila3 = new int [3];
        int cp1 = 3;
        int cp2 = 2;
        int cp3 = 1; 
        int cpf1= 3;
        for (int i = 0; i<10;i++){
            for (int j = 0; j<10;j++){
            matriz1[i][j] = (int)(Math.random()*10);
        }
        }
         for (int i = 0; i<10;i++){
            for (int j = 0; j<10;j++){
                System.out.print(matriz1[i][j]+" ");
        }
             System.out.println("");
        }
           for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                System.out.print("matriz["+i+"]"+"["+j+"]"+"=");
            matriz1[i][j] = leer.nextInt();
        }
        }
           
       /* for (int j = 0; j<3;j++){
            fila1[j] = matriz2[0][j];
            fila2[j] = matriz2[1][j];
            fila3[j] = matriz2[2][j];
            System.out.println(fila1[j]);
            System.out.println(fila2[j]);
            System.out.println(fila3[j]);

        }*/
       
        for (int i = 0; i<10;i++){
        for (int j = 0; j<10;j++){
                if ((matriz1[i][j] == fila1[0])&& (matriz1[i][j + 1] == fila1[1]) && (matriz1[i][j + 2] == fila1[2])) {
                    cp1 = j;
                    cpf1 = i;
                } 
                if ((matriz1[i][j] == fila2[0]) && (matriz1[i][j + 1] == fila2[1]) && (matriz1[i][j + 2] == fila2[2])) {
                    cp2 = j;
                } 
                if ((matriz1[i][j] == fila3[0]) && (matriz1[i][j + 1] == fila3[1]) && (matriz1[i][j + 2] == fila3[2])){
                    cp3 = j;
                }
            }
        }
              
             
        
        
       if (cp1 == cp2 && cp2 == cp3 ){
            System.out.println("la matriz2 se encontro dentro de la matriz1 primaria");
            System.out.println("la matriz2 empieza en matriz1 ["+cpf1+"]"+"["+cp1+"]");
        }else{
           System.out.println("la matriz2 no se encontro dentro de la matriz1");
        }
    }
    
    
}
