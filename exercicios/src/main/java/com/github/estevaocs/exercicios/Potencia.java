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
public final class Potencia {

    /**
     * Metodo que calcula a pontencia
     *
     * @param x base
     * @param y expoente
     * @return potencia
     * @throws IllegalArgumentException - x e y negativos
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
