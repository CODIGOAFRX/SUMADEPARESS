/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadepares;

/**
 *
 * @author AlumnoT
 */
public class Sumadepares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       int suma = 0 ;
       for ( int i = 2; i <=100 ; i +=2 ) {
           suma += i;  // += "significa suma = suma + i"
        }
        System.out.println("La suma de los numeros pares del 1 al 100 es: " + suma);
    }
    }
    

