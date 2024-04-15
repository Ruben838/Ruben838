package com.mycompany.calcularfactorial;

import java.util.Scanner;

public class UtilitatsEnters {
    public static int entrarEnterPositiu() {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        boolean estat = true;
        System.out.print("Introdueix un numero entre el 1 i el 10: ");
         do {
                if (lector.hasNextInt()) {
                    numero = lector.nextInt();
                    lector.nextLine();
                    
                    if(numero > 0 && numero <= 10){
                        estat = false;
                    }else{
                        System.out.print("No es un numero entre el 1 i el 10: ");
                    }
                    
                }else{
                    System.out.print("No es un numero enter, Torna a intentar-ho: ");
                    lector.nextLine();
                }
            } while (estat);
        return numero;
    }
    public static long calcularFactorial(int num) {
    long factor = 1;
        for (int i = 2; i <= num; i++) {
        factor *= i;  
        }
    return factor;
    }
   
}
