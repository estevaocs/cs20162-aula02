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
public class SomaNaturaisTest {
    
    SomaNaturais soma;
    
    public SomaNaturaisTest() {
        soma =  new SomaNaturais();
    }

    /**
     * Teste Valido
     */
    @Test
    public void testSomaNaturais() {
        assertEquals(6,SomaNaturais.somaNaturais(3));
    }
    
    /**
     * Teste com numero negativo
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturaisInvalida() {
        SomaNaturais.somaNaturais(-3);
    }
    
    
    
}
