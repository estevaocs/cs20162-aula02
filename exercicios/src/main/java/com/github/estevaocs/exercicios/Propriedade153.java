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
public final class Propriedade153 {

    /**
     * Metodo que verifica se o numero n possui a propriedade 153
     *
     * @param n
     * @return
     * @throws IllegalArgumentException
     */
    public static boolean propriedade153(int n) throws IllegalArgumentException {
        int i;
        int j;
        int k;

        if (n < 0) {
            throw new IllegalArgumentException("o numero tem que ser "
                    + "positivo");
        }

        if (n > 9999) {
            throw new IllegalArgumentException("o numero tem que ser menor"
                    + " que 10000");
        }

        i = n / 100;
        j = (n - 100 * i) / 10;
        k = n % 10;

        return (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) == n;

    }

}
