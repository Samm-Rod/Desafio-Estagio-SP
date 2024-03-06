/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_quatro;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class Programs {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Simulação da primeira visita
        System.out.println("Primeira visita:");
        System.out.println("Ligando o interruptor 1...");
        boolean[] estadoInicial = simularPrimeiraVisita();
        
        // Simulação da segunda visita
        System.out.println("\nSegunda visita:");
        System.out.println("Qual interruptor você gostaria de ligar? (1, 2 ou 3)");
        int interruptor = sc.nextInt();
        boolean[] estadoFinal = simularSegundaVisita(estadoInicial, interruptor);
        
        // Determinando qual interruptor controla cada lâmpada
        System.out.println("\nResultado:");
        determinarControleLampadas(estadoInicial, estadoFinal, interruptor);
        
        sc.close();
    }
    
    // Método para simular a primeira visita à sala das lâmpadas
    public static boolean[] simularPrimeiraVisita() {
        // Estado inicial: todos os interruptores desligados
        boolean[] estadoInicial = {false, false, false};
        // Simulação: ligar o interruptor 1
        estadoInicial[0] = true;
        return estadoInicial;
    }
    
    // Método para simular a segunda visita à sala das lâmpadas
    public static boolean[] simularSegundaVisita(boolean[] estadoInicial, int interruptor) {
        // Estado final: copiar o estado inicial
        boolean[] estadoFinal = estadoInicial.clone();
        // Simulação: ligar o interruptor escolhido na segunda visita
        estadoFinal[interruptor - 1] = !estadoFinal[interruptor - 1];
        return estadoFinal;
    }
    
    // Método para determinar qual interruptor controla cada lâmpada
    public static void determinarControleLampadas(boolean[] estadoInicial, boolean[] estadoFinal, int interruptor) {
        for (int i = 0; i < estadoInicial.length; i++) {
            if (estadoInicial[i] == estadoFinal[i]) {
                System.out.println("O interruptor " + (i + 1) + " controla a lâmpada que estava acesa.");
            } else {
                System.out.println("O interruptor " + (i + 1) + " controla a lâmpada que estava apagada.");
            }
        }
        if (interruptor == 1) {
            System.out.println("Você ligou o interruptor 1 na segunda visita.");
        } else if (interruptor == 2) {
            System.out.println("Você ligou o interruptor 2 na segunda visita.");
        } else {
            System.out.println("Você ligou o interruptor 3 na segunda visita.");
        }
    }
}

