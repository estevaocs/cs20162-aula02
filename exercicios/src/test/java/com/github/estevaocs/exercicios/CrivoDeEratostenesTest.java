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
public class CrivoDeEratostenesTest {
    
    CrivoDeEratostenes crivo;
    int[] a;
    
    public CrivoDeEratostenesTest() {
    crivo = new CrivoDeEratostenes(); 
    }

    /**
     * Test of crivoEratostenes method, of class CrivoDeEratostenes.
     */
    @Test
    public void testCrivoEratostenes() {
        a = new int[20];
        int n = 5;
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        int[] b = new int[20];
        b[4] = 1;
       assertArrayEquals(b, crivo.crivoEratostenes(a, n));
        
    }
    
    /**
     * Test of crivoEratostenes method, of class CrivoDeEratostenes.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesInvalido() {
        a = new int[10];
        int n = 3;
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        a[2] = 1;
        int[] b = new int[10];
        
       assertArrayEquals(b, crivo.crivoEratostenes(a, n));
        
    }
    
    /**
     * Test of crivoEratostenes method, of class CrivoDeEratostenes.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesInvalido2() {
        a = new int[10];
        int n = -3;
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        int[] b = new int[10];
        
       assertArrayEquals(b, crivo.crivoEratostenes(a, n));
        
    }
}
