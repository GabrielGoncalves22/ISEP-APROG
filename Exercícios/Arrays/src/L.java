import java.util.Scanner;

//L - Vizinhos
public class L {
    static Scanner read = new Scanner(System.in);
    static final int MAX_NUMBERS = 30;

    public static void main(String[] args) {
        int[] numbers = new int[MAX_NUMBERS];

        numbersGreaterNeighbors(numbers, readNumbers(numbers));
    }

    //Função para ler um conjunto de números inteiros
    public static int readNumbers(int[] numbers) {
        int number, numberElements = 0;

        do {
            number = read.nextInt();
            if (number > 0) {
                numbers[numberElements] = number;
                numberElements++;
            }
        } while (number > 0);

        return numberElements;
    }

    //Procedimento para visualizar todos os números maiores que os seus vizinhos
    public static void numbersGreaterNeighbors(int[] numbers, int numberElements) {
        for (int i = 1; i < numberElements - 1; i++) {
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                System.out.println(numbers[i]);
            }
        }
    }
}
