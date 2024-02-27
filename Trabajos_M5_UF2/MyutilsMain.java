package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Myutils;

public class MyutilsMain {

    public static void main(String[] args) {
        String cadena = "Saludos";
        int day = 7, month = 3, year = 2000;
        double numero = 6;
              
        Myutils.inverteix(cadena);
        Myutils.calcularEdad(day, month, year);
        Myutils.factorial(numero);
    }
    
}
