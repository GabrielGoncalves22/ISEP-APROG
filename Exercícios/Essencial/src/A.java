import java.util.Scanner;

//A - Somar algarismos pares
public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0, sumPairs = 0, digit;

        while (number <= 0) {
            number = read.nextInt();
        }

        do {
            digit = number % 10;
            if (digit % 2 == 0) {
                sumPairs += digit;
            }
            number /= 10;
        } while (number > 0);

        System.out.println(sumPairs);
    }
}
