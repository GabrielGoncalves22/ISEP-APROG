import java.util.Scanner;

//H - Capicua
public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final int MAX_ATTEMPTS = 5;
        int number, countAttempts = 0;
        boolean numberCapicua;

        do {
            number = read.nextInt();
            countAttempts++;
            numberCapicua = capicua(number);
        } while (!numberCapicua && MAX_ATTEMPTS > countAttempts);

        if (numberCapicua) {
            System.out.println("capicua");
        } else {
            System.out.println("tentativas excedidas");
        }
    }

    //Função para verificar se um número é ou não capicua
    public static boolean capicua(int number) {
        int digit, copyNumber, newNumber = 0;

        copyNumber = number;

        do {
            digit = copyNumber % 10;
            newNumber = newNumber * 10 + digit;
            copyNumber /= 10;
        } while (copyNumber > 0);

        return (number == newNumber);
    }
}
