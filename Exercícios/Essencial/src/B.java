import java.util.Scanner;

//B - Somar algarismos pares (v2)
public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, digit, sumPairs = 0;

        number = read.nextInt();

        while (number > 0) {

            do {
                digit = number % 10;
                if (digit % 2 == 0) {
                    sumPairs += digit;
                }
                number /= 10;
            } while (number > 0);

            System.out.println(sumPairs);

            number = read.nextInt();
            sumPairs = 0;
        }
    }
}
