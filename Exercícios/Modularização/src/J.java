import java.util.Scanner;

//J - Adivinha o número
public class J {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int secretNumber = read.nextInt();

        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        System.out.println(guessNumber(secretNumber));
    }

    //Função para contar o número de tentativas realizadas para acertar no número secreto
    public static int guessNumber(int secretNumber) {
        int number, numberAttempts = 0;
        boolean correctNumber = false;

        do {
            number = read.nextInt();

            if (number > secretNumber) {
                System.out.println("Tente menor");
            } else if (number < secretNumber) {
                System.out.println("Tente maior");
            } else {
                correctNumber = true;
                System.out.println("Acertou");
            }

            numberAttempts++;
        } while (!correctNumber);

        return numberAttempts;
    }
}
