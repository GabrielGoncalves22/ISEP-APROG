import java.util.Scanner;

//Z - Percentagem de algarismos pares e maior ímpar
public class Z {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0, numberDigits = 0, numberPairs = 0, biggestOdd = 0, digit;
        double percentagePairs;

        while (number <= 0) {
            number = read.nextInt();
        }

        do {
            digit = number % 10;
            if (digit % 2 == 0) {
                numberPairs++;
            } else if (digit > biggestOdd) {
                biggestOdd = digit;
            }
            numberDigits++;
            number = number / 10;
        } while (number > 0);

        percentagePairs = (double) numberPairs / numberDigits * 100;
        System.out.println(String.format("%.2f", percentagePairs) + "%");

        if (numberPairs == numberDigits) {
            System.out.println("nao ha algarismos impares");
        } else {
            System.out.println(biggestOdd);
        }
    }
}
