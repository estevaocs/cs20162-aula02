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
public class NumeroPrimo {

    /**
     * Metodo que ira mostrar se o numero de entrada n é um primo é primo ou nao
     *
     * @param n numero de entrada
     * @return true para numeros primos, false para numeros nao primos
     * @throws IllegalArgumentException
     */
    public static boolean primo(int n) throws IllegalArgumentException{
        if (n > 1) {

            for (int i = 2; i <= (n - 1); i++) {

                if ((n % i) == 0) {
                    return false;
                }// fim se

            }// fim for

            return true;

        } else {
            throw new IllegalArgumentException("o numero tem que ser maior que 1");
        }
    }// fim metodo primo

}// fim class
