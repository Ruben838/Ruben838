package com.mycompany.calcularfactorial;

public class CalcularFactorial {

    public static void main(String[] args) {
        int numero = 0;
        long factor;
        numero = UtilitatsEnters.entrarEnterPositiu();

        System.out.println("\n---------------------------");
        
        factor = UtilitatsEnters.calcularFactorial(numero);
        System.out.println("El Factorial del numero " + numero + " es: " + factor);
        
        System.out.println("---------------------------");
 
    }
    
}
