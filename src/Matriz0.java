import java.util.Scanner;

public class Matriz0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz");
        int linhas = sc.nextInt();

        System.out.println("Digite a quantidade de columnas da matriz");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.printf("Digite os valores da Matriz: [%d, %d]\n", linhas, colunas);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posiçao{" + linha +"}{" + coluna + "}");
                matriz[linha][coluna] = sc.nextInt();

            }
            System.out.println();
        }
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz){
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(linha + " ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        int soma = 0;
        for(int[] linha : matriz){
            for(int valorColuna : linha){
                soma = soma + valorColuna;
                
            }

        }
        System.out.println("Valor total da soma da matriz "+ soma);
    }
}
