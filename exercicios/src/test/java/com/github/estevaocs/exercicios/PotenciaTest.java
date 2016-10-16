/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.estevaocs.exercicios;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estevao
 */
public class PotenciaTest {
    
    Potencia pot; 
    
    public PotenciaTest() {
        pot = new Potencia();
    }

    /**
     * Test of potencia method, of class Potencia.
     */
    @Test
    public void testPotenciaValida() {
        int x = 2;
        int y = 2;
        int expResult = 4;
        int result = pot.potencia(x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of potencia method, of class Potencia.
     */
    @Test
    public void testPotenciaValida2() {
        int x = 55;
        int y = 2;
        int expResult = 3025;
        int result = pot.potencia(x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste com a base negativa.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaInvalida() {
        int x = -2;
        int y = 2;
        pot.potencia(x, y);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Teste com a expoente negativa.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaInvalida2() {
        int x = 2;
        int y = -2;
        pot.potencia(x, y);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Teste com a base  e expoente negativa.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaInvalida3() {
        int x = -2;
        int y = -2;
        pot.potencia(x, y);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
