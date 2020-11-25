package com.ATPEstruturaDeDados;

/**
 * @autor Johnny Carvalho - 23:54
 * @create 24/11/2020
 */
public class No {
    public String dados;
    public int frequency;
    public No next;

    // construtos
    public No (String element1, int element2) {
        dados = element1;
        frequency = element2;
        next = null;
    }
}
