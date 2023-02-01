import java.util.Scanner;

//L - Números perfeitos
public class L {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalNumbers, number = 6, addDivisors = 0, perfectNumbers = 0;

        totalNumbers = read.nextInt();

        do {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    addDivisors += i;
                }
            }

            if (number == addDivisors) {
                System.out.println(number);
                perfectNumbers++;
            }

            number++;
            addDivisors = 0;

        } while (perfectNumbers < totalNumbers);
    }
}
