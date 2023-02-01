import java.util.Scanner;

//P - Algarismos Repetidos
public class P {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int originalNumber, mainNumber, secondaryNumber, mainDigit, secondaryDigit, mainPos, secondaryPos;
        boolean noRepetition;

        originalNumber = read.nextInt();

        while (originalNumber >= 0) {

            mainNumber = originalNumber;
            secondaryNumber = originalNumber;
            noRepetition = true;
            mainPos = 0;

            do {
                mainDigit = mainNumber % 10;
                mainPos++;
                secondaryPos = 0;

                do {
                    secondaryDigit = secondaryNumber % 10;
                    secondaryPos++;
                    if ((mainDigit == secondaryDigit) && (mainPos != secondaryPos)) {
                        noRepetition = false;
                    }
                    secondaryNumber /= 10;
                } while (secondaryNumber > 0 && noRepetition);

                mainNumber /= 10;
                secondaryNumber = originalNumber;
            } while (mainNumber > 0 && noRepetition);

            if (!noRepetition) {
                System.out.println(originalNumber + " : algarismo (" + mainDigit + ") repetido nas posicoes (" + mainPos + ") e (" + secondaryPos + ")");
            }

            originalNumber = read.nextInt();
        }
    }
}