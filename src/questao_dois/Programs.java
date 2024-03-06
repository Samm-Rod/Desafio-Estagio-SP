/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_dois;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class Programs {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        sc.close();

        boolean pertence = false;
        int a = 0, b = 1;
        
        while (a <= numero) {
            if (a == numero) {
                pertence = true;
                break;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(numero + (pertence ? " pertence à sequência de Fibonacci." : " não pertence à sequência de Fibonacci."));
    }
    
}
