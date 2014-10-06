/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio2;

import java.util.Scanner;

/**
 *
 * @author Vaio
 */
public class PessoaU {
    
     public static void main(String[] args){
         
         int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              DadosArray arr = new DadosArray(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa de Vetores!!!");
         
          /*int maxSize = 100;
         DadosArray arr;
         arr = new DadosArray(maxSize); */
         
         arr.insert("João", "Arquiteto", 25);
         arr.insert("Pedro", "Engenheiro", 32);
         arr.insert("Maria", "Médica", 29);
         arr.insert("Cristina", "Analista", 42);
         arr.insert("Jorge", "Programador", 38);
         
         arr.displayVetor();
         
         String pesquisaItem = "Cristina";
         /* Pessoa found;
         found = arr.findPorNome(pesquisaItem);
         if (found != null)
         {
             System.out.println("Encontrado   ");
             found.displayPessoa();
         }
         else
             System.out.println("Não foi encontrado" + pesquisaItem);
         
         System.out.println("Apagar Maria");
         
         arr.delete("Maria");
         
         arr.displayVetor();   */
         
           if (!arr.find(entrada.nextLine()))
                  System.out.println("Não encontrado nenhum nome!!");
              
              System.out.println("Digite um nome para buscar:");
              
              int posicao = arr.findPorNome(entrada.nextLine());
              
              if (posicao != arr.size())
                    System.out.println("Encontrei na posicao" + posicao );
              else
                    System.out.println("Não encontrado");
              
              System.out.println("Digite um nome ser removido:");
              
              if (arr.delete(entrada.nextLine()))   
                    System.out.println("Removido!!!");
              else  
                   System.out.println("Não encontrado!!!");  
              
              arr.displayVetor();
          }      
         
         
         
     }
         

