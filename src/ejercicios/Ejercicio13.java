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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        double familia,dias,op1,op2,op3,op4;
        System.out.println("Digite el número de integrantes de su familia a viajar");
        familia=Double.parseDouble(lea.next());
        System.out.println("Digite el número de días que desea");
        dias=Double.parseDouble(lea.next());
        op1=familia*25000;
op2=op1*dias ;
op3=(op2*12)/100;
op4=op2+op3;
        System.out.println("El monto a pagar por su familia es de"+op4);
        
                
    }
  
}
