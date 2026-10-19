public class Matriz {
    public static void main(String[] args) {
        // Criando a matriz // primeiro [] linhas e o segundo [] e as colunas
        int[][] matriz = new int[3][3]; // Matriz 3 po 3
        matriz[0][0] = 5; // linha 0  coluna 0
        matriz[0][1] = 11; // linha 0 coluna 1
        matriz[0][2] = 1; // linha 0 coluna 2

        matriz[1][0] = 6; // linha 1 coluna 0
        matriz[1][1] = 34;// linha 1 coluna 1
        matriz[1][2] = 5;// linha 1 coluna 2

        matriz[2][0] = 32;// linha 2 coluna 0
        matriz[2][1] = 3;// linha 2 coluna 1
        matriz[2][2] = 1;// linha 2  coluna 2
        // exibindo os valores
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(linha + " ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
