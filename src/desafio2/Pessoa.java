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
public class Pessoa {

    private String nome;
    private String profissao;
    private int idade;

    public Pessoa(String no, String profi, int id) {
        nome = no;                                  //construtor
        profissao = profi;
        idade = id;
    }

    public void displayPessoa() {
    System.out.println("O nome é:" + nome + " e a profissão é: " + profissao+ " e a idade é: " + idade);
        
    }

    public String getNome() {
        return nome;
    }
}

class DadosArray {             //Classe dados

    private Pessoa[] a;
    private int nElems;

    public DadosArray(int max) {         //construtor
        a = new Pessoa[max];
        nElems = 0;
    }

    public Pessoa find(String procuraNome){
        int j;
        for(j=0; j<nElems; j++)
            if( a[j].getNome().equals(procuraNome))
                break;
         if(j == nElems)
             //return false;
            System.out.println("Não foi enctrado o nome procurado!!!");
         else
             return a[j];
  
    }

    // Inserir pessoa no vetor
    public void insert(String no, String profi, int id) {
        a[nElems] = new Pessoa(no, profi, id);
        nElems++;
    }

    // Remove pessoa
    public boolean delete(String procuraNome) {
        int j;
        for (j = 0; j < nElems; j++) 
            if (a[j].getNome().equals(procuraNome)) 
                break;
            
        
        if (j == nElems) 
            return false;
         else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k+1];
                nElems--;
            
            return true;
        }
    }

    //Mostra conteúdo do vetor
    public void displayVetor() {
        for (int j = 0; j < nElems; j++) {
            a[j].displayPessoa();
        }
    }

}
