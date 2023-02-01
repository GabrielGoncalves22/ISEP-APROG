import java.util.Scanner;

//N - Sequências crescentes
public class N {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, copyNumber, lastNumber = 0, digit, lastDigit = 9;
        boolean firstNumber = true, growingNumber = true;

        number = read.nextInt();

        while (number >= 0) {

            if (firstNumber) {
                firstNumber = false;
            } else {
                if (number > lastNumber) {

                    copyNumber = number;
                    boolean firstDigit = true;

                    do {
                        digit = copyNumber % 10;

                        if (firstDigit) {
                            firstDigit = false;
                        } else if (digit >= lastDigit) {
                            growingNumber = false;
                        }

                        lastDigit = digit;
                        copyNumber /= 10;

                    } while (copyNumber > 0 && growingNumber);

                    if (growingNumber) {
                        System.out.println(number);
                    }
                }
            }

            growingNumber = true;
            lastNumber = number;
            number = read.nextInt();
        }
    }
}
