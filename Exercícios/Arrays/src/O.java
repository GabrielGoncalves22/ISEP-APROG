import java.util.Scanner;

//O - Quadrantes
public class O {
    static Scanner read = new Scanner(System.in);
    static final int MIN_DIMENSION = 2;
    static final int MAX_DIMENSION = 20;

    public static void main(String[] args) {
        int dimension = readDimension();
        int[][] matrix = new int[dimension][dimension];

        readNumbers(matrix);
        System.out.println("[" + quadrant2Sum(matrix) + "][" + quadrant1Sum(matrix) + "]");
        System.out.println("[" + quadrant3Sum(matrix) + "][" + quadrant4Sum(matrix) + "]");
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

    //Função para calcular a soma dos números do 1º quadrante
    public static int quadrant1Sum(int[][] matrix) {
        int sum = 0;
        for (int line = 0; line < matrix.length / 2; line++) {
            for (int column = matrix[line].length / 2; column < matrix[line].length; column++) {
                sum += matrix[line][column];
            }
        }
        return sum;
    }

    //Função para calcular a soma dos números do 2º quadrante
    public static int quadrant2Sum(int[][] matrix) {
        int sum = 0;
        for (int line = 0; line < matrix.length / 2; line++) {
            for (int column = 0; column < matrix[line].length / 2; column++) {
                sum += matrix[line][column];
            }
        }
        return sum;
    }

    //Função para calcular a soma dos números do 3º quadrante
    public static int quadrant3Sum(int[][] matrix) {
        int sum = 0;
        for (int line = matrix.length / 2; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length / 2; column++) {
                sum += matrix[line][column];
            }
        }
        return sum;
    }

    //Função para calcular a soma dos números do 4º quadrante
    public static int quadrant4Sum(int[][] matrix) {
        int sum = 0;
        for (int line = matrix.length / 2; line < matrix.length; line++) {
            for (int column = matrix[line].length / 2; column < matrix[line].length; column++) {
                sum += matrix[line][column];
            }
        }
        return sum;
    }
}
