import java.util.Scanner;

//Y - Divisores múltiplos de 3
public class Y {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;
        boolean dividers = false;

        while (number <= 0) {
            number = read.nextInt();
        }

        for (int i = 3; i <= number / 2; i += 3) {
            if (number % i == 0) {
                System.out.println(i);
                dividers = true;
            }
        }

        if (!dividers) {
            System.out.println("sem divisores multiplos de 3");
        }
    }
}
