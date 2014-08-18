/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cristiane;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */

class EstruturaAvancada  //Criamos aqui nossa classe EstruturaAvancada
   {
   private String[] a;                 // cria a referência do vetor
   private int nElems;               // nElems controla quantos elementos o vetor terá ...
   //-----------------------------------------------------------
   public EstruturaAvancada(int max)         // método construtor
      {
      a = new String[max];                 // cria o vetor do tamanho q instanciar na classe usuário
      nElems = 0;                        // inicialmente sem itens ...
      }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------
   public boolean find(String searchKey)
      {                              // metodo buscará o valor que a classe usuaria pedir ...
      int j;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(a[j] == searchKey)           // entrou o item?  ou   if(a[j].equals(searchKey))
            break;                       // sai do for antes de finalizar ...
      if(j == nElems)                    // precisou chegar no final??
         return false;                   // se sim, retorna falso
      else
         return true;                    // se não, encontrou ...
      }  // fim da busca

 //--------------------------------------------------------------
//Método de busca pela primeira letra ....
//--------------------------------------------------------------
   public boolean findLetra(String searchKey)
      {                              // metodo buscará o valor que a classe usuaria pedir ...
      int j;
      boolean teste = false;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(a[j].charAt(0) == searchKey.charAt(0))   // entrou a primeira letra
                              // sai do for antes de finalizar ...
         {
           System.out.println("Encontrei o nome:" + a[j]);
           teste = true;                    
      }  
return teste;
}
     
   
   
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------
   public void insert(String value)    // insere um elemento no vetor
      {
      a[nElems] = value;             // insere nessa posição ...
      nElems++;                      // incrementa o tamanho
      }
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------
   public boolean delete(String value)
      {
      int j;
      for(j=0; j<nElems; j++)        // varre o vetor 
         if( value == a[j] )
            break;
      if(j==nElems)                  // se não encontrar retorna falso
         return false;
      else                           // se encontrar ...
         {
         for(int k=j; k<nElems; k++) // move os mais altos para "frente"
            a[k] = a[k+1];
         nElems--;                   // decrementa o contador de elementos
         return true;
         }
      }  // final do método de remoção
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
   
   }  

public class Cristiane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int max = 100;  
        //EstruturaAvancada e = new EstruturaAvancada(100);
        Scanner entString = new Scanner (System.in); 
          Scanner entInt = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
          int qty = 0;
                    
          System.out.println("Bem Vindo, Quantos nomes vai guardar?");
          qty=entString.nextInt();
          EstruturaAvancada e = new EstruturaAvancada(qty);
          
          for (int i = 0; i < qty; i++) 
          {
            System.out.println("Digite um nome!!!");
            e.insert(entInt.nextLine());
         }
          System.out.println("Digite uma letra");
           // e.findLetra(entrada.nextLine());
          
          if(!e.findLetra(entString.nextLine()))
               System.out.println("Não encontrado!!!");
         
    
    }  
}