import java.util.Scanner;

//A - Média de números com menos de X algarismos
public class A {
    static final int K = 5;

    public static void main(String[] args) {
        System.out.println(String.format("%.2f", averageOfNumbers()));
    }

    //Função para contar o número de digitos de um número
    public static int numberOfDigits(int number) {
        int numberDigits = 1;
        while (number > 9) {
            numberDigits++;
            number /= 10;
        }
        return numberDigits;
    }

    //Função para realizar a média dos números introduzidos
    public static double averageOfNumbers() {
        Scanner read = new Scanner(System.in);
        int number, n, sum = 0, quantity = 0;
        double result;

        n = read.nextInt();
        number = read.nextInt();

        while (numberOfDigits(number) < n && quantity < K) {
            sum += number;
            quantity++;
            if (quantity < K) {
                number = read.nextInt();
            }
        }

        result = quantity;
        if (quantity != 0) {
            result = (double) sum / quantity;
        }

        return result;
    }
}
