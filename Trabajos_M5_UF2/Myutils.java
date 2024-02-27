/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Period;


/**
 * 
 * @author Raúl
 * Classe de funcions pròpies utils.
 */
public class Myutils {
   


/**
 *
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix(String cadena) {
    StringBuilder resultat = new StringBuilder();
    if (cadena == null) {
        cadena = null;
    }

    for (int i = cadena.length() - 1; i >= 0; i--) {
        resultat.append(cadena.charAt(i));
    }
    System.out.println(resultat.toString());
    return resultat.toString();
}
/**
 *
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 *
 */
public static int calcularEdad(int day, int month, int year) {
        LocalDate fechaActual = LocalDate.now();
        int edad;
        try {
            LocalDate dataNaixement = LocalDate.of(year, month, day);

            Period periodo = Period.between(dataNaixement, fechaActual);

            edad = periodo.getYears();

            if (edad > 150) {
                edad = -1;
            } else {
            }
        } catch (Exception e) {
            edad = -2;
        }
        System.out.println(edad);
        return edad;
    }


/**
 *
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial(double numero) {
    double resultado = 1; 
    
    if (numero < 0) {
        numero = -1;
        System.out.println(numero);
        return -1; 
    }

    for (int i = 2; i <= numero; i++) {
        resultado *= i;
    }
    System.out.println(resultado);
    return resultado;
}
}

