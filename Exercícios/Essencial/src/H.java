import java.util.Scanner;

//H - Número primo
public class H {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int number = 0, i = 2;
        double squareRoot;
        boolean cousinPrime = true;

        while (number <= 0) {
            number = ler.nextInt();
        }

        squareRoot = Math.sqrt(number);

        while (cousinPrime && i <= squareRoot) {
            if (number % i == 0) {
                cousinPrime = false;
            } else {
                i++;
            }
        }

        if (cousinPrime && number != 1) {
            System.out.println("primo");
        } else {
            System.out.println("nao e primo");
        }
    }
}
