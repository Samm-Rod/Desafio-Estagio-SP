/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_cinco;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class Programs {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();
        sc.close();
        
        String invertida = inverterString(entrada);
        
        System.out.println("String invertida: " + invertida);
    }
    
    public static String inverterString(String str) {
        // Criar uma StringBuilder para facilitar a inversão
        StringBuilder sb = new StringBuilder();
        // Iterar sobre a string de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            // Adicionar cada caractere invertido à StringBuilder
            sb.append(str.charAt(i));
        }
        // Retornar a string invertida
        return sb.toString();
    }

}
