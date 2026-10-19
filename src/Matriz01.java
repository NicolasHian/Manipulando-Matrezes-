import java.util.Arrays;
import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        // cadastrando Produtos
        String[][] Produtos = new String[3][3];
        Produtos[0][0] = "110";
        Produtos[0][1] = "tv";
        Produtos[0][2] = "5.300";

        Produtos[1][0] = "355";
        Produtos[1][1] = "PC";
        Produtos[1][2] = "3.150";

        Produtos[2][0] = "545";
        Produtos[2][1] = "camiseta ";
        Produtos[2][2] = "75.89";
        //imprime a tabela toda
        for (String[] produto : Arrays.asList(Produtos)) {
            for (String dado : produto) {
                System.out.print(dado + " ");
            }
            System.out.println();
        }
        //pega o codigo do user e acha ele na tabela
        Scanner input = new Scanner(System.in);
        boolean ProdutoEncontrado = false;
        System.out.println("Digite o codigo do produto que deseja buscar :");
        String codigo = input.nextLine();
        for (String[] produto : Produtos) {
            if (produto[0].equals(codigo)) { //o . equals compara um variavel com a outra
                System.out.println("Produto encontrado");
                System.out.println("codigo: " + produto[0] + " Nome: " + produto[1] + " Preçpo: " + produto[2]);

                ProdutoEncontrado = true;
                break;// quando encontra parar se nao ele vai analisar todas a linhas sendo que ele pode parar na primeira

            }
        }
            if (!ProdutoEncontrado) {   // ✅ só verifica depois que o for terminou
                System.out.println("Produto não encontrado.");
            }
            }





    }

