/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClasseUsuariaPale {
     public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              EstruturaDadosPaleo arr = new EstruturaDadosPaleo(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              
              System.out.println("Bem Vindo Joaquim!!!");
              
              for (int i = 1; i < 6; i++) {
                 System.out.println("Digite a cor " + i);
                 String cor = entrada.nextLine();
                 System.out.println("Digite o tamanho: " );
                 String tamanho = entrada.nextLine();
                 
                 arr.insertionSort(cor, tamanho);
              }

              System.out.println("Vamos ver se esta ordenado por cor:");
              
              arr.display();
              
              System.out.println("Muito bem! Vamos fazer uma busca binária de uma cor? Digite:");
              
              int posicao = arr.findByName(entrada.nextLine());
              
              if (posicao != arr.size())
                    System.out.println("Encontrei na posicao " + posicao );
              else
                    System.out.println("Não encontrado");
              
              arr.insertionSort();
              System.out.println("Acabei de ordenar os dados por idade, ok?");
              
              arr.display();
              
              System.out.println("Vamos fazer uma busca binária por idade? Digite a idade:");

              if (arr.delete(entrada.nextLine()))   
                    System.out.println("Removido!!!");
              else  
                   System.out.println("Não encontrado!!!");  
              
              arr.display();
          }      
          
}

