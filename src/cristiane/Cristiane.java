package cristiane;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
class EstruturaDadosVetor {

    //--------------------------------------------
    //define a referencia do vetor
    private String[] a;
    private int nElements;
    //--------------------------------------------
    
    //Construtor da classe-------------------------
    public EstruturaDadosVetor(int max) {
        a = new String[max]; // qtde maxima de elementos
        nElements = 0;// começa com zero
    }
    //----------------------------------------------

    //Insert----------------------------------------
    public void insertNomes(String nome) {
        a[nElements] = nome;
       nElements++;
    }
    //-----------------------------------------------

    //Exibe o nome conforme o indice----------------------
    public String ExibeNomes(int indice) {
        return a[indice];
    }
    //----------------------------------------------------

    //Pega a letra que deseja buscar
    public boolean BuscaAvancada(String letra) {

        int i = 0;
        boolean teste = false;
        //for para busca da letra
        for (i = 0; i < nElements; i++) //condição para verificar
        {
            if (ExibeNomes(i).charAt(0) == letra.charAt(0)) {
                System.out.println(ExibeNomes(i) + " que começa com a letra " + letra);
            }
        }
        if (i == nElements) {
            teste = true;
        }
        return teste;
    }


        public void insert(String value)
        {
        a[nElements] = value;
        nElements++;
        }
}
    public class Cristiane { 

        public static void main(String[] args) {

            //Pergunta ao usuário a qtde de nomes
            int qtde = 0;
            Scanner scanInt = new Scanner(System.in); 
            System.out.println("Digite a qtde = ");
            qtde = scanInt.nextInt();

            Scanner scanString = new Scanner(System.in);
            //Instancia-------------------------
            EstruturaDadosVetor edv = new EstruturaDadosVetor(qtde);
            
            //for para popular o vetor
            for (int i = 0; i < qtde; i++) {
                System.out.println("Digite o nome = ");
                edv.insertNomes(scanString.nextLine());
            }

            // pergunta a letra
            System.out.println("Digite a letra = ");

            //trata o retorno da 
            if(!edv.BuscaAvancada(scanString.nextLine()))
                   System.out.println("Não foram encontrados nomes com a letra " + scanString);
            }
        }


