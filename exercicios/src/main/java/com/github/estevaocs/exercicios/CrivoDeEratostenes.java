package com.github.estevaocs.exercicios;

/**
 *
 * @author Estevao
 */
public final class CrivoDeEratostenes {

    /**
     * Nesse método, os números múltiplos de 2, 3, 4 e assim por diante, são
     * progressivamente eliminados. Por exemplo, em um conjunto com os números
     * de 2 até 100, inclusive, iniciamos por 2 e para cada múltiplo de 2 até
     * 100, simplesmente retiramos esses do conjunto. Depois o 3 é considerado
     * e, todo múltiplo de 3 maior que 3 é eliminado do conjunto. O processo se
     * repete para 4 e assim por diante, até que o próximo valor a ser
     * considerado seja maior que 50. Neste caso, o processo pode ser
     * interrompido pois, se este não foi removido, então nenhum anterior é
     * divisor deste e, com certeza, não há número múltiplo deste que seja menor
     * 100.
     *
     * @param a - vetor de inteiros
     * @param n - numero maior que 1
     * @return
     * @throws IllegalArgumentException - numero menor que 1
     * @throws IllegalArgumentException - vetor invalido
     */
    public static int[] crivoEratostenes(int a[], int n) 
            throws IllegalArgumentException {
        if (n > 1) {

            for (int i = 2; i <= n; i++) {
                if (a[i] != 0) {
                    throw new IllegalArgumentException("vetor invlido");
                }
            }
            for (int i = 2; i <= (n / 2); i++) {

                for (int c = (i + i); c <= n; c += i) {

                    a[c] = 1;

                }// fim for

            }//fim for

            return a;

        } else {
            throw new IllegalArgumentException("n tem que ser maior que 1");
        }// fim if/else

    }// fim metodo

}// fim class
