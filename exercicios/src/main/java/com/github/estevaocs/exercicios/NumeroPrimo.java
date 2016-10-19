package com.github.estevaocs.exercicios;

/**
 *Classe contendo o metodo numeroPrimo() que verifica se um numro é primo ou nao.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class NumeroPrimo {

    /**
     * Metodo que ira mostrar se o numero de entrada n é um primo é primo ou nao
     *
     * @param n numero de entrada
     * @return true para numeros primos, false para numeros nao primos
     * @throws IllegalArgumentException - caso o numero 'n' seja menor que 1
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
