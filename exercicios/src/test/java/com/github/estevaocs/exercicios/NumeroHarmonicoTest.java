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
public class NumeroHarmonicoTest {
    
    NumeroHarmonico harmonico;
    
    public NumeroHarmonicoTest() {
        harmonico = new NumeroHarmonico();
    }

    /**
     * Test of numeroHarmonico method, of class NumeroHarmonico.
     */
    @Test
    public void testNumeroHarmonico() {
        assertEquals(2.2833335, harmonico.numeroHarmonico(5),1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNumeroHarmonicoInvalido() {
        harmonico.numeroHarmonico(0);
    }
    
}
