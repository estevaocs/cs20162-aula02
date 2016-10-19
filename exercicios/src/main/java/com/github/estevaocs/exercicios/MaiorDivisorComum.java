package com.github.estevaocs.exercicios;

/**
 *Classe contendo o 2 Metodos que retornam o MDC entre dois numeros, utilizando
 * o crivo de Erastostenes
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public final class MaiorDivisorComum {
    
    /**
     * Metodo para achar o maior divisor comum entre dois números
     * 
     * @param a int 
     * @param b int
     * @return um inteiro que é o maior divisor comum entre a e b.
     * @throws  IllegalArgumentException -  numero b maior que a ou b negativo
     */
    public static int crivoEratostenes(int a, int b) 
            throws IllegalArgumentException{
        
        int m;
        
        if (b > a) {
            throw new IllegalArgumentException("a tem que ser maior ou "
                    + "igual à b");
        }
        
        if (b <= 0) {
            throw new IllegalArgumentException("b tem que ser maior que 0");
        }
        
        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }// fim while
        
        return a;
        
    }// fim metodo crivoEratostenes
    
    /**Metodo para achar o maior divisor comum entre dois números,
     contudo, limita-se ao uso de subtrações (não faz uso do resto da divisão 
     inteira).
     * 
     * @param a int 
     * @param b int
     * @return int - a - o MDC entre os paramentros a e n
     */
    public static int crivoEratostenesSubtracoes(int a, int b) {
        
        if (b > a) {
            throw new IllegalArgumentException("a tem que ser maior ou "
                    + "igual à b");
        }
        
        if (b <= 0) {
            throw new IllegalArgumentException("b tem que ser maior que 0");
        }
        
        while (a != b) {
            
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
            
        }// fim while
        
        return a;
        
    }// fim metodo crivoEratostenes
    
}//fim class
