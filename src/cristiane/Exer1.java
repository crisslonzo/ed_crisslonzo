/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cristiane;

import java.util.Scanner;

/**
 *
 * @author Vaio
 */

    
class EstruturaE1  //Criamos aqui nossa classe EstruturaVetor
   { 
   private String[] a;   // cria a referência do vetor, guarda datas objetos
   private int nElems;               // nElems controla quantos elementos o vetor terá ...
   //-----------------------------------------------------------
   public EstruturaE1(int max)         // método construtor
      {
      a = new String[max];                 // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }
   
   public int size()    // size retorna o valor de nelemns pra classe usuaria qtos itens tem no vetor, se algum
   {                    // valor foi encontrado ou nao
       return nElems;
   }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------
   public int find(String searchKey)
      {  
         
         int curIn;
         int lowerBound = 0;
        int upperBound = nElems-1;
        
        while(true){
        curIn = (lowerBound + upperBound) /2;  //curIn = 2
        
      
         
          if (a[curIn].equals(searchKey))  //a[2] = geraldo não
                  return curIn;         //
          else if(lowerBound > upperBound)  // 0> 4? nao
              return nElems;                    //
          else
          {
                  if (a[curIn].compareTo(searchKey) <0) //a posicao atual > do q searchekey (geraldo) 
                      lowerBound = curIn + 1;    //p baixo   //bernadino é > q geraldo volta Não, valor negativo
                  else
                      upperBound = curIn -1;  // p cima      valor positivo 
                  }
        }
      }

      
// metodo buscará o valor que a classe usuaria pedir 
      public boolean buscar(String searchKey)
      {
         int j;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(a[j].equals(searchKey))           // encontrou o item?
            break;                       // sai do for antes de finalizar ...
      if(j == nElems)                    // precisou chegar no final??
         return false;                   // se sim, retorna falso
      else
         return true;                    // se não, encontrou ...
      }  // fim da busca
   
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
         if( value.equals(a[j]) )
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
   //-----------------------------------------------------------
   
  public boolean displayFirst(String letter)             // mostra o conteúdo do vetor
  {  
    boolean retorno = false;
    for(int j=0; j<nElems; j++)    {  
      if (letter.charAt(0) == a[j].charAt(0)) {
          System.out.print(a[j] + " ");  
          System.out.println("");
          retorno = true;
      }
    }
    return retorno;   
   } 

}



public class Exer1 {
    public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              EstruturaE1 arr = new EstruturaE1(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              System.out.println("Bem Vindo ao Programa de Vetores!!!");
              for (int i = 1; i < 4; i++) {
                 System.out.println("Digite o nome " + i);
                 arr.insert(entrada.nextLine());
              }

              System.out.println("Agora que você cadastrou os nomes, digite uma letra");

              if (!arr.displayFirst(entrada.nextLine()))
                  System.out.println("Não encontrado nenhum nome!!");
              
              System.out.println("Digite um nome para buscar:");
              
              if (arr.buscar(entrada.nextLine()))
                    System.out.println("Encontrei!!!");
              else
                    System.out.println("Não encontrado");
              
              System.out.println("Digite um nome ser removido:");
              
              if (arr.delete(entrada.nextLine()))   
                    System.out.println("Removido!!!");
              else  
                   System.out.println("Não encontrado!!!");  
              
              arr.display();
          }      
          
}