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
public class Ejercicio4 {
    public static void main(String[] args) {
       Scanner lea = new Scanner(System.in);
       double saldo, fin, porcen;
        System.out.println("Digite el saldo inicial");
        saldo=Double.parseDouble(lea.next());
        porcen= (1.5*saldo)/100  ;
        fin= porcen+saldo;
         System.out.println("Su saldo final es de "+fin);       
    }
}
