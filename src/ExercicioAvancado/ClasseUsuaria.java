/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExercicioAvancado;

/**
 *
 * @author vaio
 */
import java.util.Scanner;


/**
 *
 * @author aleaguado
 */
public class ClasseUsuaria {
  
    public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              EstruturaExercicioAvancado arr = new EstruturaExercicioAvancado(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
               Scanner entradaFloat = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa de Vetores de Jogadores!!!");
              
              for (int i = 1; i < 3; i++) {
                 System.out.println("Digite o nome " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Digite a altura do(a) " + nome);
                 float altura = entradaFloat.nextFloat();
                 System.out.println("Digite a idade do(a) " + nome);
                 int idade = entradaint.nextInt();
                 arr.insert(nome, altura, idade);
              }

              System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma idade");

              
              if (!arr.findByIdade(entrada.nextInt()))
                  System.out.println("Não encontrado nenhuma idade!!");
              

          
            System.out.println("Digite um nome para buscar");
                    if (!arr.find(entrada.nextLine()))
                    
                    arr.display();
    
          } 
}