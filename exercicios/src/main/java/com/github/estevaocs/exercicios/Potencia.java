package com.github.estevaocs.exercicios;

/**
 *Classe contendo o Metodo potencia() que realiza a potencia de um numro x pelo 
 * expoente y.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public final class Potencia {

    /**
     * Metodo que calcula a pontencia
     *
     * @param x base
     * @param y expoente
     * @return potencia
     * @throws IllegalArgumentException - x e y negativos
     * @see metodo produto da Classe Produto desse mesmo projeto.
     */
    public static int potencia(int x, int y) throws IllegalArgumentException {

        int potencia = 1;
        int i;

        if (x < 0) {
            throw new IllegalArgumentException("a base nao pode ser menor"
                    + " que 0");
        }

        if (y < 0) {
            throw new IllegalArgumentException("o expoente nao pode ser "
                    + "menor que 0");
        }

        for (i = 1; i <= y; i++) {
            potencia = Produto.produto(potencia, x);
        }// fim for

        return (potencia);

    }// fim do método potencia

}// fim da classe Potencia
