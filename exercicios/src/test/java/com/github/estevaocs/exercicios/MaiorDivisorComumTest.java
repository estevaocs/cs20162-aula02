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
public class MaiorDivisorComumTest {
    
    MaiorDivisorComum mdc;
    
    public MaiorDivisorComumTest() {
        mdc = new MaiorDivisorComum();
    }

    /**
     * Test of crivoEratostenes method, of class MaiorDivisorComum.
     */
    @Test
    public void testCrivoEratostenes() {
        assertEquals(4, mdc.crivoEratostenes(16, 12));
    }
    
    /**
     * Teste invalido com b maior que a
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesInvalida() {
         mdc.crivoEratostenes(9, 12);
    }
    
    /**
     * Teste invalido com b menor igual a 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesInvalida2() {
         mdc.crivoEratostenes(12, -1);
    }

    /**
     * Test of crivoEratostenesSubtracoes method, of class MaiorDivisorComum.
     */
    @Test
    public void testCrivoEratostenesSubtracoes() {
        assertEquals(4, mdc.crivoEratostenesSubtracoes(16, 12));
    }
    
    /**
     * Teste invalido com b maior que a
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesSubtracoesInvalida() {
         mdc.crivoEratostenesSubtracoes(9, 12);
    }
    
    /**
     * Teste invalido com b menor igual a 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesSubtracoesInvalida2() {
         mdc.crivoEratostenesSubtracoes(12, -1);
    }
    
}
