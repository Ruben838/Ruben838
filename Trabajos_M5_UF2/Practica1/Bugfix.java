package trabajos_m5_uf2;

import java.util.Scanner;
/*
 * @author Ruben
*/
public class Bugfix {
    public static double bugfix() {
    Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;
        boolean comprobar = false;
        String numero2 = "";
        double n1, n2;
        /*
        en el arxiu del bugfix he posat el codi del main i he corregit el seu
        contingut
        */
        do {
            /* 
            He tret l'introducció del número 1 i l'he introduït en un mètode 
            dintre de l'arxiu "feature"
            */
            n1 = Feature.feature();
            do {
                System.out.println("\n OperaciÃ³? (Indica el signe)");
                System.out.println("+ = sumar \n - = restar \n"
                        + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                        + "\n % = residu");
                operacion = sc.nextLine();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                        || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                        || operacion.equals("*")) {
                    comprobar = true;
                } else {
                    comprobar = false;
                }
            } while (comprobar != true);
            /* 
            He tret l'introducció del número 2 i l'he introduït en un mètode 
            dintre de l'arxiu "feature"
            */
            n2 = Feature.feature1();
            do {
                comprobar = true;
                switch (operacion) {
                /* 
                He arreglat els errors matemàtics de les operacions de suma i 
                potència
                */
                    case "+":
                        res = n1 + n2;
                        break;
                    case "-":
                        res = n1 - n2;
                        break;
                    case "x":
                    case "X":
                        res = n1 * n2;
                        break;
                    case "/":
                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            /* 
                            He canviat el tipus de variable a la variable 
                            "numero2", ja que era una String, aquest canvi 
                            l'he assignat a la variable "n2"
                            */
                            n2 = Double.parseDouble(numero2);
                        }
                        res = n1 / n2;
                        break;
                    case "*":
                        res = Math.pow(n1, n2);
                        break;
                    case "%":
                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            n2 = Double.parseDouble(numero2);
                        }
                        res = n1 % n2;
                        break;
                }
            } while (comprobar != true);

            /*
            He cambiat la ordre de sortida del resultat perque quedi mes visual
            */
            System.out.println("\nL'operaciÃ³ resultan es: " + n1 + operacion + n2 + " = " + res);
            System.out.println("\n Vols continuar operant? \n");
            System.out.println(" [s/n]");
            do {
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, posa un valor vÃ lid. \n");
                        comprobar = false;
                }
            } while (comprobar != true);
        } while (operacion.equals("s") || operacion.equals("S"));
        return res;
    }
}
 