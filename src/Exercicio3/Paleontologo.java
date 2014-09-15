/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

/**
 *
 * @author Aluno
 */
public class Paleontologo   
   { 
   private String nome;
   private String cor;
   private double tamanho;
   
//--------------------------------------------------------------
   public Paleontologo(String n, String c, double t)
      {                               // construtor
      nome = n;
      cor = c;
      tamanho = t;
     
      }
//--------------------------------------------------------------
   public void display()
      {
      System.out.print("Nome do animal:" + nome + "  Cor: " + cor + ", Tamanho:   " + tamanho);
     
      }
//--------------------------------------------------------------
  public String getNome()
     {
      return nome;
     }
   
   public String getCor()           // retorna cor
      { 
       return cor;
      }
   
     public double getTamanho()           // retorna tamanho
      { 
        return tamanho; 
      }
   }  // Final da Classe Paleontologo
