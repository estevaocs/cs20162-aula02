package com.github.estevaocs.exercicios;

/**
 *Classe contendo o Metodo que retorna o n-esimo numero harmonico.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public final class NumeroHarmonico {
    
    /**
     * Metodo que produz como resultado o n-ésimo número harmônico.
     * 
     * @param n int 
     * @return float n-ésimo número harmônico.
     * @throws IllegalArgumentException - n menor que 1
     */
    public static float numeroHarmonico(int n)throws IllegalArgumentException {
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
