/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio2;

/**
 *
 * @author Vaio
 */
public class PessoaU {
    
     public static void main(String[] args){
         
         int maxSize = 100;
         DadosArray arr;
         arr = new DadosArray(maxSize);
         
         arr.insert("João", "Arquiteto", 25);
         arr.insert("Pedro", "Engenheiro", 32);
         arr.insert("Maria", "Médica", 29);
         arr.insert("Cristina", "Analista", 42);
         arr.insert("Jorge", "Programador", 38);
         
         arr.displayVetor();
         
         String pesquisaItem = "Cristina";
         Pessoa found;
         found = arr.find(pesquisaItem);
         if (found != null)
         {
             System.out.println("Encontrado   ");
             found.displayPessoa();
         }
         else
             System.out.println("Não foi encontrado" + pesquisaItem);
         
         System.out.println("Apagar Maria");
         
         arr.delete("Maria");
         
         arr.displayVetor();
         
     }
}
