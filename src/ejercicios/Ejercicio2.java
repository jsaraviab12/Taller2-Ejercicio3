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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double edad,op1,op2;
        System.out.println("Digite su edad");
        edad=Double.parseDouble(lea.next());
        op1=200-edad;
        op2=op1/10;
        System.out.println("Su número de pulsaciones en 10 segundos de ejercicios son "+op2);
    }
}
