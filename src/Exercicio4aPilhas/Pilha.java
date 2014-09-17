/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio4aPilhas;

/**
 *
 * @author Vaio
 */
public class Pilha {
    
   private int maxSize;        // tamanho do array
   private String[] pilhaArray;   //vetor usamos ele para implementar pilha
   private int top;            // topo da pilha
//--------------------------------------------------------------
   public Pilha(int s)         // construtor
      {
      maxSize = s;             // colocamos aqui o tamanho do vetor que servirá de pilha
      pilhaArray = new String[maxSize];  // criamos aqui o vetor que servirá de pilha
      top = -1;                // top vale -1 porque ainda não tem nenhum item!
      }
//--------------------------------------------------------------
   public void inserir(String j)    // insere um item no topo da pilha
      {
      pilhaArray[++top] = j;     // increment a variavel top e naquela posição da pilha já insere o valor
      //OBS: O sinal de ++ do lado esquerdo faz ele incrementar e depois retornar o valor de top
   }
//--------------------------------------------------------------
   public String remove()           // remove o item no topo da pilha
      {
      return pilhaArray[top--];  // acessa o item e decrementa top
      //OBS: O sinal de -- do lado direito faz ele retornar o valor de top e depois decrementar
                                    //OBS: repare que na realidade não se remove nada, simplesmente, gerenciamos top 
                                    // para não ver mais esse item!!!
      }
//--------------------------------------------------------------
   public String pegaitem()          // pega item
      {
      return pilhaArray[top];       //retornará o item que esta no topo da pilha
      }
//--------------------------------------------------------------
   public boolean estaVazio()    // metodo para verificar se a pilha esta vazia
      {
      return (top == -1);       // retornará verdadeiro se top for igual a -1
      }
//--------------------------------------------------------------
   public boolean estaCheio()     // metodo para verificar se a pilha esta cheia
      {
      return (top == maxSize-1);    //retornará verdadeiro se top for igual ao tamanho maximo -1
      }
//--------------------------------------------------------------
    
}


