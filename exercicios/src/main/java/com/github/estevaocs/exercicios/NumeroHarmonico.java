/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.estevaocs.exercicios;

/**
 *
 * @author Estevao
 */
public final class NumeroHarmonico {
    
    /**metodo que produz como resultado o n-ésimo número harmônico.
     * 
     * @param n int 
     * @return float n-ésimo número harmônico.
     */
    public static float numeroHarmonico(int n){
        float i = 2;
        float s = 1;
        
        if(n < 1) {
            throw new IllegalArgumentException("o numero tem que ser maior que 0");
        }
        
        while(i <= n) {
            s = s + 1 / i;
            i = i + 1;
        }// fim while
        
        return s;
    }// fim metodo numeroHarmonico
    
}// fim classe NumeroHarmonico
