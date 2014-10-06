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
public class FilaPrioridadeHosp {
   private int maxSize;
   private Paciente[] queArray; //Novamente utilizamos um vetor 
   private int nItems;
//-------------------------------------------------------------
   public FilaPrioridadeHosp(int s)          // metodo construtor
      {
      maxSize = s;
      queArray = new Paciente[maxSize]; //Criamos o vetor do tamanho que a classe usuaria pede por parametro
      nItems = 0;
      }
//-------------------------------------------------------------
   public void insert(String nome, int prioridade)    // Metodo de Inserção ...podemos dizer "Enfilar" ...
      {
      int j;

      if(nItems==0)                         // Se não tiver nenhum item na FILA...
         queArray[nItems++] = new Paciente(nome, prioridade);         // ... inserimos na posição 0 e depois incrementamos nItems
      else                                // ... se tiver algo na fila ...
         {
         for(j=nItems-1; j>=0; j--)         // ... começando pelo final da fila ... 
            {
            
            if( prioridade >= queArray[j].getPrioridade())      // ... comparamos se o item que queremos inserir é maior do que cada um que já esta na fila
               queArray[j+1] = queArray[j]; // ... se for, eles vão pular uma posição "pra traz" na fila!!!
            else     
                // ... no momento em que o item que queremos inserir for menor do que os itens na fila...
               break;                     // paramos nessa posição e ...
            }  // end for
         queArray[j+1] = new Paciente(nome, prioridade);            // inserimos na posição de traz ...
         nItems++;
         }  // final do else
      }  // final do insert ...
//-------------------------------------------------------------
   public void remove()             // remove!!!
      {queArray[--nItems].displayPaciente(); }
//-------------------------------------------------------------
   /*public String peekMin()            // pega o último item
      { return queArray[nItems-1]; }    */
//-------------------------------------------------------------
   public boolean isEmpty()         // vê se esta vazio
      { return (nItems==0); }
//-------------------------------------------------------------
   public boolean isFull()          // vê se esta cheio!!!
      { return (nItems == maxSize); }
//-------------------------------------------------------------
   }  // fim da classe da fila de prioridade


