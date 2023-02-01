import java.util.Scanner;

//Z - Primo a tempo inteiro
public class Z {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number1, number2;

        number1 = read.nextInt();
        number2 = read.nextInt();

        cousinPrimeFullTimeInterval(number1, number2);
    }

    //Procedimento para processar os números primos a tempo inteiro de um intervalo
    public static void cousinPrimeFullTimeInterval(int interval1, int interval2) {
        int countCousinFullTime = 0;

        if (interval1 > interval2) {
            int help = interval1;
            interval1 = interval2;
            interval2 = help;
        }

        for (int number = interval1; number <= interval2; number++) {
            if (cousinPrimeFullTime(number)) {
                System.out.println(number);
                countCousinFullTime++;
            }
        }

        System.out.println("(" + countCousinFullTime + ")");
    }

    //Função para contar o número de digitos de um número
    public static int numberDigits(int number) {
        int numberDigits = 1;
        while (number > 9) {
            numberDigits++;
            number /= 10;
        }
        return numberDigits;
    }

    //Função para verificar se um número é primo ou não
    public static boolean cousinPrime(int number) {
        int i = 2;
        double squareRoot = Math.sqrt(number);
        boolean cousinPrime = true;

        while (cousinPrime && i <= squareRoot) {
            if (number % i == 0) {
                cousinPrime = false;
            } else {
                i++;
            }
        }

        return cousinPrime;
    }

    //Função para verificar se um número é ou não primo a tempo inteiro
    public static boolean cousinPrimeFullTime(int number) {
        int copyNumber, digit;
        boolean cousinFullTime;

        copyNumber = number;

        do {
            cousinFullTime = cousinPrime(copyNumber);

            digit = copyNumber % 10;
            copyNumber /= 10;
            copyNumber = (digit * (int) Math.pow(10, numberDigits(copyNumber))) + copyNumber;

        } while (cousinFullTime && number != copyNumber);

        return cousinFullTime;
    }
}
