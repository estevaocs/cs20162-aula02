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
public class ProdutoTest {
    
    Produto prod;
    
    public ProdutoTest() {
        prod = new Produto();
    }

    /**
     * Teste valido com o fator a maior que fator b
     */
    @Test
    public void testProdutoAMaior() {
        assertEquals(6, prod.produto(3, 2));
    }
    
    /**
     * Teste valido com o fator a menor que fator b
     */
    @Test
    public void testProdutoBMaior() {
        assertEquals(6, prod.produto(2, 3));
    }
    
    /**
     * Teste invalido com fator negativo
     */
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoFatorANegativo() {
        prod.produto(-2, 3);
    }
    
    /**
     *  Teste invalido com B negativo
     */
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoFatorBNegativo() {
        prod.produto(2, -3);
    }
    
    /**
     * Teste invalido com A negativo
     */
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoFatoresNegativo() {
        prod.produto(-2, -3);
    }
}
