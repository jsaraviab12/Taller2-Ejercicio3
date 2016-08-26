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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        double mi,mf,resta,porcentaje,suma;
        System.out.println("Digite el monto inicial");
        mi=Double.parseDouble(lea.next());
        System.out.println("Digite el monto final");
        mf=Double.parseDouble(lea.next());
        resta=mi-mf;
        porcentaje=(resta*20)/100;
suma=resta+porcentaje;
        System.out.println("El valor de la llamada es:"+suma);
    }
}
