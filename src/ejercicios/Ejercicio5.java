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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
         double sueldo, dpp,dss,dsf,dca,total;
         System.out.println("Digite su sueldo base");
         sueldo=Double.parseDouble(lea.next ());
         dpp= (sueldo*1)/100;
         dss=(sueldo*4)/100;
         dsf=(0.5*sueldo)/100;
         dca=(sueldo*5)/100;
         total=dpp+dss+dsf+dca;
         System.out.println("Su descuento por ley de política publica es "+dpp);
         System.out.println("Su descuento por seguro social es "+dss);
         System.out.println("Su descuento por seguro forzoso es "+dsf);
         System.out.println("Su descuento por caja de ahorro es "+dca); 
         System.out.println("Total a pagar por sus descuentos es "+total);
         
    }
}
