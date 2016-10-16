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
public class NumeroPrimoTest {
    
    NumeroPrimo primo;
    
    public NumeroPrimoTest() {
        primo = new NumeroPrimo();
    }

    /**
     * Teste com numero primo
     */
    @Test
    public void testPrimo() {
        assertEquals(true, primo.primo(5));
    }
    
    /**
     * Teste com numero não primo
     */
    @Test
    public void testNaoPrimo() {
        assertEquals(false, primo.primo(4));
    }
    
    /**
     * Teste com numero menor ou igual a zero
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalido() {
        primo.primo(-5);
    }
}
