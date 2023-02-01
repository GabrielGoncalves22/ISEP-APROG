import java.util.Scanner;

//Y - Tabuadas de um intervalo
public class Y {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int number1, number2;
        number1 = readPositiveIntegerValue();
        number2 = readPositiveIntegerValue();

        timesTableInterval(number1, number2);
    }

    //Função para ler e retornar um número inteiro positivo maior que zero
    public static int readPositiveIntegerValue() {
        int number;
        do {
            number = read.nextInt();
        } while (number <= 0);
        return number;
    }

    //Procedimento para processar a tabuada de todos os números de um intervalo
    public static void timesTableInterval(int number1, int number2) {
        if (number1 > number2) {
            int help = number1;
            number1 = number2;
            number2 = help;
        }

        for (int j = number1; j <= number2; j++) {
            timesTableNumber(j);
        }
    }

    //Procedimento que escreve a tabuada de um número específico
    public static void timesTableNumber(int number) {
        System.out.println("Tabuada de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
