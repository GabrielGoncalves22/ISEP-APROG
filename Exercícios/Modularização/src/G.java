import java.util.Scanner;

//G - Números de Armstrong
public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        for (int i = 0; i <= number; i++) {
            if (verifyNumberArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    //Função para contar o número de digitos de um número
    public static int numberOfDigits(int number) {
        int numberDigits = 1;
        while (number > 9) {
            numberDigits++;
            number /= 10;
        }
        return numberDigits;
    }

    //Função para verificar se um número é um número de Armstrong
    public static boolean verifyNumberArmstrong(int number) {
        int copyNumber, digit, numberDigits, sumArmstrong = 0;

        numberDigits = numberOfDigits(number);
        copyNumber = number;

        do {
            digit = copyNumber % 10;
            sumArmstrong += Math.pow(digit, numberDigits);
            copyNumber /= 10;
        } while (copyNumber > 0);

        return (number == sumArmstrong);
    }
}
