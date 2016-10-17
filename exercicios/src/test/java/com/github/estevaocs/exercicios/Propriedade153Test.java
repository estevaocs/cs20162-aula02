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
public class Propriedade153Test {
    
    Propriedade153 propriedade;
    
    public Propriedade153Test() {
        propriedade = new Propriedade153();
    }

    /**
     * Teste com numero com propriedade valido 
     */
    @Test
    public void testPropriedade153() {
        assertEquals(true, propriedade.propriedade153(153));
    }
    
    /**
     * Teste com numero sem propriedade valido
     */
    @Test
    public void testNaoPropriedade153() {
        assertEquals(false, propriedade.propriedade153(155));
    }
    
    /**
     * Teste com numero invalido menor que 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testeInvalido() {
        propriedade.propriedade153(-400);
    }
    
    /**
     * Teste com numero invalido maior que 9999
     */
    @Test (expected = IllegalArgumentException.class)
    public void testeInvalido2() {
        propriedade.propriedade153(10000);
    }
    
}
