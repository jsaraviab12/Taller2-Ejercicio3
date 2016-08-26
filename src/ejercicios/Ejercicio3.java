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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double persona1,persona2,persona3,porcentaje1,porcentaje2,porcentaje3,suma;
        System.out.println("Digite la cantidad de dinero invertido por la persona 1");
        persona1=Double.parseDouble(lea.next());
        System.out.println("Digite la cantidad de dinero invertido por la persona 2");
        persona2=Double.parseDouble(lea.next());
        System.out.println("Digite la cantidad de dinero invertido por la persona 3");
        persona3=Double.parseDouble(lea.next());
        suma=persona1+persona2+persona3;
        porcentaje1=(persona1*100)/suma;
        porcentaje2=(persona2*100)/suma;
        porcentaje3=(persona3*100)/suma;
        System.out.println("EL porcentaje invertido por la persona 1 es de "+porcentaje1);
        System.out.println("El porcentaje invertido por la persona 2 es de "+porcentaje2);
        System.out.println("EL porcentaje invertido por la persona 3 es de "+porcentaje3);
        
    }
   
}
