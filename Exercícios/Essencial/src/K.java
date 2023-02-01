import java.util.Scanner;

//K - Números primos até um limite
public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, j;
        double squareRoot;
        boolean cousinPrime;

        number = read.nextInt();

        for (int i = 2; i <= number; i++) {
            cousinPrime = true;
            j = 2;

            squareRoot = Math.sqrt(i);

            while (cousinPrime && j <= squareRoot) {
                if (i % j == 0) {
                    cousinPrime = false;
                } else {
                    j++;
                }
            }

            if (cousinPrime) {
                System.out.println(i);
            }

        }
    }
}
