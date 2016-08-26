/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
     double horas, op1, op2, op3;
        System.out.println("Digite el numero de horas trabajadas");
        horas=Double.parseDouble(lea.next());
        op1=horas*20000;
        op2=(op1*5)/100;
op3=op1-op2;
        System.out.println("monto del descuento es "+op2);
        System.out.println("El monto total a pagar es "+op3);

        
    }
    
}
