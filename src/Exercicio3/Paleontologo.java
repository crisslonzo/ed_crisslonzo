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
   private String cor;
   private double tamanho;
   
//--------------------------------------------------------------
   public Paleontologo(String c, double t)
      {                               // construtor
      cor = c;
      tamanho = t;
     
      }
//--------------------------------------------------------------
   public void display()
      {
      System.out.print("   Cor: " + cor);
      System.out.print(", Tamanho: " + tamanho);
      }
//--------------------------------------------------------------
   public String getCor()           // retorna cor
      { return cor; }
   
      public double getTamanho()           // retorna tamanho
      { return tamanho; }
   }  // Final da Classe Paleontologo
