/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author jsaravia1
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double peli,dias,op1,op2,op3;
        System.out.println("Digite la cantidad de películas a alquilar");
       peli=Double.parseDouble(lea.next());
        System.out.println("Digite el número de días de alquiler");
        dias=Double.parseDouble(lea.next());
        op1=peli-1;
        op2=op1*1500;
        op3=op2*dias;
        System.out.println("El monto a pagar es "+op3);
                
                
                
                
                
                
                
                
                
    }
}
