import java.util.Scanner;

//I - Mínimo múltiplo comum
public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number1 = 0, number2 = 0, gcd = 0, lcm;

        while (number1 <= 0) {
            number1 = read.nextInt();
        }

        while (number2 <= 0) {
            number2 = read.nextInt();
        }

        //Verificar se o 1º número é menor que o 2º
        if (number1 > number2) {
            int borrowedNumber = number1;
            number1 = number2;
            number2 = borrowedNumber;
        }

        //Encontrar máximo divisor comum
        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }

        //Encontrar mínimo múltiplo comum através do produto dos 2 números com a divisão do máximo divisor comum
        lcm = number1 * number2 / gcd;

        System.out.println(lcm);
    }
}
