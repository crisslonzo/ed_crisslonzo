/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExercicioAvancado;

/**
 *
 * @author vaio
 */
public class Jogador
   { 
   private String nome;
   private float altura;
   private int idade;
//--------------------------------------------------------------
   public Jogador(String no, float al, int id)
      {                               // comentario aqui
      nome = no;
      altura = al;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayJogador()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Altura: " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   
    public int getIdade()           // comentario aqui
      { return idade; }

   
   
   }  // Final da Classe Pessoa