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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        double op1, op2, op3, suma, colores, centimetros, palabras;
        System.out.println("Digite cantidad de palabras del aviso");
        palabras=Double.parseDouble(lea.next());
        System.out.println("Digite tamaño en centímetros del aviso");
        centimetros=Double.parseDouble(lea.next());
        System.out.println("Digite números de colores del aviso");
        colores=Double.parseDouble(lea.next());
        op1=palabras*20000;
        op2=centimetros*15000;
        op3=colores*25000;
        suma=op1+op2+op3;
        System.out.println("El monto a pagar por su aviso es de "+suma);
    }
}
