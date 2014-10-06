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
              Scanner entradaDouble = new Scanner (System.in);
              System.out.println("Bem Vindo Joaquim!!!");
              
              for (int i = 1; i < 6; i++) {
                 System.out.println("Digite a nome " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Digite a cor " );
                 String cor = entrada.nextLine();
                 System.out.println("Digite o tamanho: " );
                 double tamanho = entradaDouble.nextDouble();
                 
                 arr.insert(nome, cor, tamanho);
              }

              System.out.println("Vamos ver se esta ordenado por cor:");
              
              arr.insertionSortCor();
              arr.display();
              
              System.out.println("Muito bem! Vamos fazer uma busca binária de uma cor? Digite:");
              
                      
               if (!arr.findAd(entrada.nextLine()))
                  System.out.println("Nenhum dinossauro encontrado");
              
              
              arr.insertionSortTamanho();
              System.out.println("Acabei de ordenar os dados por tamanho, ok?");
              
              arr.display();
              
              System.out.println("Vamos fazer uma busca binária por tamanho? Digite o tamanho:");

             //double posicao1 = arr.findByTamanho(entradaDouble.nextDouble());
              
              if (!arr.findByTamanho(entradaDouble.nextDouble()))
                    System.out.println("Nenhum dinossauro encontrado"); 
              
              
                    System.out.println("Agora vou imprimir todos");
              
              arr.display();
              
          }      
          
}

