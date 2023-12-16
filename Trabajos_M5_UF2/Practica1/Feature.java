/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos_m5_uf2;

import java.util.Scanner;

/**
 * @author Ruben
*/
public class Feature {
    public static double feature() {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;
        boolean comprobar = false;
        /*
        He afegit la part del codi d'introduir un numero en un metode dintre
        de l'arxiu Feature
        */
          String numero1;
            do {
                System.out.println("\n Introdueix el primer numero. ");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double n1 = Double.parseDouble(numero1);
        return n1;
            
}
    /*
    He creat un ultim metode en l'arxiu Feature on aqui es guardara el valor
    del numero 2
    */
     public static double feature1() {
         Scanner sc = new Scanner(System.in);
         String numero2;
            do {
                System.out.println("\n Introdueix el segon numero.");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double n2 = Double.parseDouble(numero2);
        return n2;
     }
}
