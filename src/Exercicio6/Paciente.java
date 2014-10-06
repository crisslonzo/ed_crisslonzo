/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio6;

/**
 *
 * @author Aluno
 */
public class Paciente {
    
   private String nome;
   private int prioridade;
      
//--------------------------------------------------------------
   public Paciente(String n, int p)
      {                               // construtor
      nome = n;
      prioridade = p;
      
      }

//--------------------------------------------------------------
   public void displayPaciente()
      {
      System.out.print("Nome do paciente:" + nome + "  Prioridade: " + prioridade);
      }
   
   
    public String getNome()
     {
      return nome;
     }
   
   public int getPrioridade()          
      { 
       return prioridade;
      }
   
    
}
