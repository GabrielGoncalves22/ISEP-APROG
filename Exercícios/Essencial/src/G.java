import java.util.Scanner;

//G - Divisores de um número
public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0, countDividers = 0;

        while (number <= 0) {
            number = read.nextInt();
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                countDividers++;
            }
        }

        System.out.println("(" + countDividers + ")");
    }
}
