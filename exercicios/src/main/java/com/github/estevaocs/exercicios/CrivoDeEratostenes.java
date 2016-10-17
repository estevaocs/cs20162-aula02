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
public final class CrivoDeEratostenes {

    /**
     *
     * @param a
     * @param n
     * @return
     * @throws IllegalArgumentException
     */
    public static int[] crivoEratostenes(int a[], int n) {
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
