/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ruben
 */
public class MyutilsTest { 
    /**
     * Test of inverteix method, of class Myutils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Saludos";
        String expResult = "sodulaS";
        String result = com.mycompany.mavenproject1.Myutils.inverteix(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularEdad method, of class Myutils.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        int day = 7;
        int month = 3;
        int year = 2000;
        int expResult = 23;
        int result = com.mycompany.mavenproject1.Myutils.calcularEdad(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of factorial method, of class Myutils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 6.0;
        double expResult = 720.0;
        double result = com.mycompany.mavenproject1.Myutils.factorial(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
   
    
}
