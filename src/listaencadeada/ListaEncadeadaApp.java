/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaencadeada;

/**
 *
 * @author Aluno
 */
public class ListaEncadeadaApp {
   public static void main(String[] args)
      {
      ListaEncadeada theList = new ListaEncadeada();  // criamos uma nova lista

      theList.insertFirst("Jessica", "Vida");      // inserimos quatro itens nela
      theList.insertFirst("Moises", "Programar");
      theList.insertFirst("Janaina", "Jasmim");
      theList.insertFirst("Jonatas", "Verdade");

      theList.displayList();              // mostramos a lista

      /*
      while( !theList.isEmpty() )         // until it's empty,
         {
         No aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
         System.out.print("Deletado ");         // 
         aLink.displayNo();                     // mostramos o nó deletado
         System.out.println("");
         }
              */
      
      
      theList.displayList();              // mostramos a lista
      if(theList.find("Jessica")  != null){
          System.out.println("Encontrei o nome:  ");
      }
      else
      {
          System.out.println("Não encontrei o nome!!" );
      }
      }  // final do método main()
   }  // final da classe usuária
    
    

