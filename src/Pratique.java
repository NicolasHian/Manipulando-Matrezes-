    import java.util.Scanner;

    public class Pratique {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] matriz = new int[3][3];


            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    System.out.printf("Digite o valor da posição [%d, %d]: ", linha, coluna);
                    matriz[linha][coluna] = input.nextInt();
                }
            }
            imprimirMatriz(matriz);
        }

        public static void imprimirMatriz(int[][] matriz) {
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print(linha + " ");
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    System.out.print(matriz[linha][coluna] + " ");
                }
                System.out.println();

            }
        }
    }