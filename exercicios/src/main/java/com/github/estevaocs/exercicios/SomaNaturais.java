package com.github.estevaocs.exercicios;

/**
 *Classe contendo o Metodo de Soma dos primeiros números naturais
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public final class SomaNaturais {

    /**
     * Metodo para somar os n primeiros números naturais
     *
     * @param n int - Maior numero a ser somado
     * @return s int - valot total da somas dos primeiros n numeros
     * @throws IllegalArgumentException - numero menor que 1
     */
    public static int somaNaturais(int n) throws IllegalArgumentException {

        int s;// variavel que receberar o valor da soma de todos os n primeiros numeros
        int i;// variavel que ira simular o valor dos n primeiros numeros e que será acrecentado na soma

        s = 1;

        if (n < 1) {
            throw new IllegalArgumentException("o numero tem que ser maior que 0");
        } else {
            for (i = 2; i <= n; i++) {
                s += i;
            }
            return (s);
        }// fim if/ else

    } // fim do método somaNaturais

}// fim da classe
