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
public class Ejercicio15 {
    public static void main(String[] args) {
     Scanner lea = new Scanner (System.in);
     double vprestado,interes,cordinaria,cespecial,vtotal;
        System.out.println("Digite el valor del prestamo");
        vprestado=Double.parseDouble(lea.next());
        interes=vprestado*0.24;  
        vtotal=vprestado+interes;
        cordinaria=(vtotal/2)/20;
        cespecial=(vtotal/2)/4;
        System.out.println("El valor total a pagar es: "+vtotal+" pesos");
        System.out.println("El valor de la cuota ordinaria es: "+cordinaria);
        System.out.println("El valor de la cuota espcial es: "+cespecial);
    }
   
}
