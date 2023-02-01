import java.util.Scanner;

//P - Fatorial dos algarismos
public class P {
    static Scanner read = new Scanner(System.in);
    static final int MIN_NUMBER = 0;
    static final int MAX_NUMBER = 10000000;

    public static void main(String[] args) {
        int n = readDimension(), x = readDimension();

        System.out.println(factorialGreaterX(n, x));
    }

    //Função para ler um número
    public static int readDimension() {
        int number;

        do {
            number = read.nextInt();
        } while (number < MIN_NUMBER || number > MAX_NUMBER);

        return number;
    }

    //Função para calcular o fatorial de um número
    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    //Função para calcular quantos números de zero até N (inclusive) possuem um fatorial superior a X
    public static int factorialGreaterX(int n, int x) {
        int total = 0;

        for (int i = 0; i <= n; i++) {
            if (factorial(i) > x) {
                total++;
            }
        }

        return total;
    }
}
