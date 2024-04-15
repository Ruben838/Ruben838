package com.mycompany.calcularfactorial;

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
public class UtilitatsEntersTest {
    
    public UtilitatsEntersTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of entrarEnterPositiu method, of class UtilitatsEnters.
     */
    @Test
    public void testEntrarEnterPositiu() {
        System.out.println("entrarEnterPositiu");
        int expResult = 3;
        int result = UtilitatsEnters.entrarEnterPositiu();
        assertEquals(expResult, result);

    }

    /**
     * Test of calcularFactorial method, of class UtilitatsEnters.
     */
    @Test
    public void testCalcularFactorial() {
        System.out.println("calcularFactorial");
        int num = 3;
        long expResult = 3L;
        long result = UtilitatsEnters.calcularFactorial(num);
        assertEquals(expResult, result);

    }
    
}
