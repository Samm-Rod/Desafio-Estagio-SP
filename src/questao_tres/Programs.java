/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_tres;

/**
 *
 * @author Root
 */
public class Programs {
     public static void main(String[] args) {
        System.out.println("a) Próximo elemento: " + proximoElementoA(7));
        System.out.println("b) Próximo elemento: " + proximoElementoB(64));
        System.out.println("c) Próximo elemento: " + proximoElementoC(36));
        System.out.println("d) Próximo elemento: " + proximoElementoD(64));
        System.out.println("e) Próximo elemento: " + proximoElementoE(8));
        System.out.println("f) Próximo elemento: " + proximoElementoF(19));
    }

    // a) 1, 3, 5, 7, ___
    public static int proximoElementoA(int ultimoElemento) {
        return ultimoElemento + 2;
    }

    // b) 2, 4, 8, 16, 32, 64, ____
    public static int proximoElementoB(int ultimoElemento) {
        return ultimoElemento * 2;
    }

    // c) 0, 1, 4, 9, 16, 25, 36, ____
    public static int proximoElementoC(int ultimoElemento) {
        return (int) Math.pow(Math.sqrt(ultimoElemento) + 1, 2);
    }

    // d) 4, 16, 36, 64, ____
    public static int proximoElementoD(int ultimoElemento) {
        int numero = (int) Math.sqrt(ultimoElemento);
        return (int) Math.pow(numero + 1, 2);
    }

    // e) 1, 1, 2, 3, 5, 8, ____
    public static int proximoElementoE(int ultimoElemento) {
        int penultimo = 1;
        int ultimo = 1;
        int proximo = penultimo + ultimo;
        while (proximo <= ultimoElemento) {
            penultimo = ultimo;
            ultimo = proximo;
            proximo = penultimo + ultimo;
        }
        return proximo;
    }

    // f) 2, 10, 12, 16, 17, 18, 19, ____
    public static int proximoElementoF(int ultimoElemento) {
        int diff = 0;
        if (ultimoElemento % 8 == 0) {
            diff = 8;
        } else if (ultimoElemento % 8 == 2 || ultimoElemento % 8 == 6) {
            diff = 2;
        } else if (ultimoElemento % 8 == 4) {
            diff = 4;
        } else if (ultimoElemento % 8 == 1 || ultimoElemento % 8 == 7) {
            diff = 1;
        } else if (ultimoElemento % 8 == 3 || ultimoElemento % 8 == 5) {
            diff = 1;
        }
        return ultimoElemento + diff;
    }
}
