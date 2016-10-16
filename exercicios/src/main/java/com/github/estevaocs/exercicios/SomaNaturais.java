package com.github.estevaocs.exercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estevao
 */
public final class SomaNaturais {
    
    /**Metodo para somar os n primeiros numeros
     * 
     * @param n int - Maior numero a ser somado
     * @return s int - valot total da somas dos primeiros n numeros
     * @throws IllegalArgumentException
     */
    public static int somaNaturais (int n) throws IllegalArgumentException{
        
        int s;// variavel que receberar o valor da soma de todos os n primeiros numeros
        int i;// variavel que ira simular o valor dos n primeiros numeros e que será acrecentado na soma
        
        s = 1;
        
        if (n < 1) {
            throw new IllegalArgumentException("o numero tem que ser maior que 0");
        } else {
            for (i = 2; i <= n ; i++) {
                s += i;
            }
            return (s);
        }// fim if/ else
        
    } // fim do método somaNaturais

}// fim da classe
