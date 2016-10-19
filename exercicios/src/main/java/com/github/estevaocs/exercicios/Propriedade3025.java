package com.github.estevaocs.exercicios;

/**
 *Classe contendo o Metodo Propriedade3025() que verifica a existencia ou nao 
 *dessa propriedade em um determinado numero.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public final class Propriedade3025 {

    /**
     * Metodo que verifica se o numero n possui a propriedade 3025
     *
     * @param n numero
     * @return - boolean - true: o numero possui a propriedade false: o numero
     * nao possui a propriedade
     * @throws IllegalArgumentException - numero maior que 9999 ou menor que 0
     * @see metodo potencia(x, y) da Classe Potencia.
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
