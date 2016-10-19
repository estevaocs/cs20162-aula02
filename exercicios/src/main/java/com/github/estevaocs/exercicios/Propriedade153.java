package com.github.estevaocs.exercicios;

/**
 *Classe contendo o Metodo Propriedade153() que verifica a existencia ou nao 
 *dessa propriedade em um determinado numero.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public final class Propriedade153 {

    /**
     * Metodo que verifica se o numero n possui a propriedade 153
     *
     * @param n - numero a ser verificado se possui a propriedade
     * @return - boolean - true : possui a propriedade
     *         - false : nao possui a propriedade
     * @throws IllegalArgumentException - o numero n nao pode ser menor que 0e
     * maior que 9999
     * @see metodo potencia(x, y) da Classe Potencia, desse mesmo pacote.
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

        return (Potencia.potencia(i, 3) + Potencia.potencia(j, 3) 
                + Potencia.potencia(k, 3)) == n;

    }

}
