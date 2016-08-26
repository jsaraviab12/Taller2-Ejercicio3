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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double presion,volumen,temperatura,op1,op2,op3,op4;
        System.out.println("Digite la presión ");
        presion=Double.parseDouble(lea.next());
        System.out.println("Digite el volumen");
        volumen=Double.parseDouble(lea.next());
        System.out.println("Digite la temperatura");
        temperatura=Double.parseDouble(lea.next());
        op1=presion*volumen;
        op2=temperatura+460;
       op3=op2*037;
       op4=op1/op3;
        System.out.println("La masa del cuerpo es "+op4);
        
                
                
            
    }
}
