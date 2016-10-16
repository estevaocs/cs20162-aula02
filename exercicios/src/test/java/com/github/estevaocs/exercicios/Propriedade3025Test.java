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
public class Propriedade3025Test {
    
    Propriedade3025 propriedade;
    
    public Propriedade3025Test() {
        propriedade = new Propriedade3025();
    }

    /**
     * Teste com numero com propriedade valido 
     */
    @Test
    public void testPropriedade3025() {
        assertEquals(true, propriedade.propriedade3025(3025));
    }
    
    /**
     * Teste com numero sem propriedade valido
     */
    @Test
    public void testNaoPropriedade3025() {
        assertEquals(false, propriedade.propriedade3025(3000));
    }
    
    /**
     * Teste com numero invalido menor que 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testeInvalido() {
        propriedade.propriedade3025(-400);
    }
    
    /**
     * Teste com numero invalido maior que 9999
     */
    @Test (expected = IllegalArgumentException.class)
    public void testeInvalido2() {
        propriedade.propriedade3025(10000);
    }
}
