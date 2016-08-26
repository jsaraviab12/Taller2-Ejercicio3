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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lea= new Scanner (System.in);
        double pre, op1, op2;
        System.out.println("Digite el valor del presupuesto");
        pre=Double.parseDouble(lea.next());
        op1=(pre*40)/100;
op2=(pre*30)/100;
           System.out.println("La cantidad de dinero que recibirá ginecología es de "+op1); 
           System.out.println("La cantidad de dinero que recibirá traumatología es de "+op2);
           System.out.println("La cantidad de dinero que recibirá pediatría es de "+op2);
           

                
    }
}
