import java.util.Scanner;

//J - Percentagem de dígitos divisores do próprio número
public class J {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalNumbers, originalNumber, copyNumber, digit, numberDivisors, numberDigits;
        double percentageDivisors, maxPercentage = 0;

        totalNumbers = read.nextInt();

        if (totalNumbers > 0) {
            for (int i = 0; i < totalNumbers; i++) {

                originalNumber = read.nextInt();
                copyNumber = originalNumber;

                numberDivisors = 0;
                numberDigits = 0;

                do {
                    digit = copyNumber % 10;
                    if (digit != 0 && originalNumber % digit == 0) {
                        numberDivisors++;
                    }
                    copyNumber /= 10;
                    numberDigits++;
                } while (copyNumber > 0);

                percentageDivisors = (double) numberDivisors / numberDigits * 100;
                System.out.println(String.format("%.2f", percentageDivisors) + "%");

                if (percentageDivisors > maxPercentage) {
                    maxPercentage = percentageDivisors;
                }
            }

            System.out.println("(" + String.format("%.2f", maxPercentage) + "%)");
        }
    }
}
