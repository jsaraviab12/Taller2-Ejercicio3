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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        double años, op1, op2, op3;
        System.out.println("Digite años de antigüedad del trabajador");
        años=Double.parseDouble(lea.next());
        op1=años-1;
        op2=op1*120000;
        op3=op2+100000;
        System.out.println("El monto del bono a pagar es de "+op3);
        
    }
}
