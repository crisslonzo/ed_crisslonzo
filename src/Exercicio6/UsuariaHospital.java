/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class UsuariaHospital {
     public static void main(String[] args){
         
          int maxSize = 5;
        FilaPrioridadeHosp p = new FilaPrioridadeHosp(maxSize); 
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        String nome;
        int prioridade;
        
        while(true)
        {
            System.out.println("Bem Vindo ao Hospital!!!");
            System.out.println("1 - Inserir paciente");
            System.out.println("2 - Próximo paciente");
            System.out.println("3 - Excluir paciente");
            System.out.println("4 - Sair");           
            System.out.print("Digite a opção desejada: ");
            int op = entradaInt.nextInt();
                                  
            switch(op)
            {
                case 1:
                {
                    System.out.println("Digite o nome do paciente: ");
                    nome = entradaString.nextLine();
                    System.out.println("Digite a prioridade do paciente: ");
                    prioridade = entradaInt.nextInt();
                    
                    if(p.isFull())
                    {
                        System.out.println("Não há espaço !");
                    }
                    else
                    {
                        p.insert(nome, prioridade);
                    }
                    break;
                }
                 case 2:{
                          System.out.println("Próximo paciente");
                         break; 
                      }
                case 3:{
                           p.remove();
                          System.out.println("Foi excluido o paciente");
                         break;  
                }
                 case 4:{                     
                          System.out.println("Saindo");
                         break; 
                      }
            }
        }
     }
}
  
