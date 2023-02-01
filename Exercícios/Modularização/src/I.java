import java.util.Scanner;

//I - Elemento de Fibonacci
public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        if (fibonacci(number)) {
            System.out.println("e de Fibonacci");
        } else {
            System.out.println("nao e de Fibonacci");
        }

    }

    //Função para verificar se um número pertence à sucessão de Fibonacci ou não
    public static boolean fibonacci(int number) {
        int previousNumber = 0, nextNumber = 1, borrowedNumber;
        boolean fibonacci = false;

        while (!fibonacci && number >= previousNumber) {
            fibonacci = previousNumber == number;

            borrowedNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = borrowedNumber;
        }
        return fibonacci;
    }
}
