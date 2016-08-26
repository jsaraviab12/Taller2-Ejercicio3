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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lea= new Scanner (System.in);
        double fotos, op1, op2, op3;
        System.out.println("Digite el numero de fotos a revelar");
        fotos=Double.parseDouble(lea.next());
        op1=fotos*1500;
         op2=(op1*16)/100;
        op3=op1+op2;
        System.out.println("El revelado completo es de "+op3);
        

    }
}
