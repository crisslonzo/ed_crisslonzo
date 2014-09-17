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
public class Usuaria {
     public static void main(String[] args){
    
    Pilha p = new Pilha(5); 
    
    System.out.println("Confira a carga no caminhão para descarregar:  ");
    p.inserir("1-Sofá ");
    p.inserir("2-TV 50 Polegadas  ");
    p.inserir("3-Rack "); 
    p.inserir("4-Geladeira ");
   
    
    while (p.estaVazio() == false) {
        System.out.println(p.remove());
    }
     }

}
