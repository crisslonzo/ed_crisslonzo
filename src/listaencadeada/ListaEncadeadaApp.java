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
      ListaEncadeada lista = new ListaEncadeada();  // criamos uma nova lista

      lista.insertFirst("Jessica", "Vida");      // inserimos quatro itens nela
      lista.insertFirst("Moises", "Programar");
      lista.insertFirst("Janaina", "Jasmim");
      lista.insertFirst("Jonatas", "Verdade");

      //lista.displayList();              // mostramos a lista

      /*
      while( !theList.isEmpty() )         // until it's empty,
         {
         No aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
         System.out.print("Deletado ");         // 
         aLink.displayNo();                     // mostramos o nó deletado
         System.out.println("");
         }
              */
      
      
      //lista.displayList();              // mostramos a lista
      if(lista.find("Jessica") != null){
          System.out.println("Encontrei o nome: Jessica ");
      }
      else
      {
          System.out.println("Não encontrei o nome!!" );
      }
      }  // final do método main()
   }  // final da classe usuária
    
    

