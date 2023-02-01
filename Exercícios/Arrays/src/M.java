import java.util.Scanner;

//M - Algarismos diferentes
public class M {
    static Scanner read = new Scanner(System.in);
    static final int MAX_NUMBERS = 100;
    static final int NUMBER_DIGITS = 10;

    public static void main(String[] args) {
        int[] numbers = new int[MAX_NUMBERS];
        int[][] numberDigits;

        int numberElements = readNumbers(numbers);
        numberDigits = new int[numberElements][NUMBER_DIGITS];

        numberDifferentDigits(numbers, numberDigits);
        printNumberDifferentDigits(numbers, numberDigits);
    }

    //Função para ler um conjunto de números inteiros e retornar o número de elementos lidos
    public static int readNumbers(int[] numbers) {
        int number, numberElements = 0;

        number = read.nextInt();

        while (number >= 0 && MAX_NUMBERS > numberElements) {
            numbers[numberElements] = number;
            numberElements++;

            number = read.nextInt();
        }

        return numberElements;
    }

    //Função para contar o número de algarismos diferentes de um número
    public static void numberDifferentDigits(int[] numbers, int[][] numberDigits) {
        int number, digit;

        for (int i = 0; i < numberDigits.length; i++) {
            number = numbers[i];
            do {
                digit = number % 10;
                number /= 10;
                numberDigits[i][digit]++;
            } while (number > 0);
        }
    }

    //Procedimento para escrever o número de algarismos diferentes de um número
    public static void printNumberDifferentDigits(int[] numbers, int[][] numberDigits) {
        int countDifferentDigits = 0;

        for (int i = 0; i < numberDigits.length; i++) {
            for (int j = 0; j < numberDigits[i].length; j++) {
                if (numberDigits[i][j] > 0) {
                    countDifferentDigits++;
                }
            }

            System.out.println(numbers[i] + ":" + countDifferentDigits);
            countDifferentDigits = 0;
        }
    }
}
