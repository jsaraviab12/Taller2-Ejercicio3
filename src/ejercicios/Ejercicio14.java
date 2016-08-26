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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner lea= new Scanner (System.in);
       double dias, op1,op2;
        System.out.println("Digite el numero de días que desea quedarse");
        dias=Double.parseDouble(lea.next());
        op1=dias*200000;
op2=op1-100000;
        System.out.println("El monto a pagar por su hospedaje es de "+op2);
    }
}
