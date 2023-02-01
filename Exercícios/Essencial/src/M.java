import java.util.Scanner;

//M - Sequência de Fibonacci
public class M {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalNumbers, previousNumber = 0, nextNumber = 1, borrowedNumber;

        totalNumbers = read.nextInt();

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.println(previousNumber);
            borrowedNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = borrowedNumber;
        }
    }
}
