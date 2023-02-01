import java.util.Scanner;

//N - Diagonais
public class N {
    static Scanner read = new Scanner(System.in);
    static final int MIN_DIMENSION = 2;
    static final int MAX_DIMENSION = 20;

    public static void main(String[] args) {
        int dimension = readDimension();
        int[][] matrix = new int[dimension][dimension];

        readNumbers(matrix);
        printMatrixDiagonals(matrix);
    }

    //Função para ler a dimensão da matriz
    public static int readDimension() {
        int dimension;

        do {
            dimension = read.nextInt();
        } while (dimension < MIN_DIMENSION || dimension > MAX_DIMENSION);

        return dimension;
    }

    //Procedimento para ler um conjunto de números inteiros
    public static void readNumbers(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                matrix[line][column] = read.nextInt();
            }
        }
    }

    //Procedimento para escrever os valores correspondentes às várias diagonais da matriz
    public static void printMatrixDiagonals(int[][] matrix) {
        int matrixLength = matrix.length;
        int column, line;

        //Parte 1
        for (column = matrixLength - 1; column >= 0; column--) {
            for (line = 0; line < matrixLength; line++) {
                if (matrixLength > (line + column)) {
                    System.out.print("[" + matrix[line][line + column] + "]");
                }
            }
            System.out.println();
        }

        //Parte 2
        for (int i = 1; i < matrixLength; i++) {
            for (line = i, column = 0; line < matrixLength && column < matrixLength; line++, column++) {
                System.out.print("[" + matrix[line][column] + "]");
            }
            System.out.println();
        }
    }
}
