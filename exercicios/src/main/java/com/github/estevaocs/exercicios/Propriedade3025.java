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
public final class Propriedade3025 {

    /**
     * Metodo que verifica se o numero n possui a propriedade 3025
     *
     * @param n numero
     * @return - boolean - true: o numero possui a propriedade false: o numero
     * nao possui a propriedade
     * @throws IllegalArgumentException - numero maior que 9999 ou menor que 0
     */
    public static boolean propriedade3025(int n) 
            throws IllegalArgumentException {

        int i;
        int j;

        if (n < 0) {
            throw new IllegalArgumentException("o numero tem que ser "
                    + "positivo");
        }

        if (n > 9999) {
            throw new IllegalArgumentException("o numero tem que ser menor"
                    + " que 10000");
        }

        i = n / 100;
        j = n % 100;

        int soma = i + j;

        return Potencia.potencia(soma, 2) == n;

    }

}
