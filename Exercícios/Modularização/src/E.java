import java.util.Scanner;

//E - Algarismos em posições comuns
public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number1, number2, commonDigits, bestPair1 = 0, bestPair2 = 0, totalPairs = 0, maxCommonDigits = 0;

        while (totalPairs <= 0) {
            totalPairs = read.nextInt();
        }

        for (int i = 0; i < totalPairs; i++) {
            number1 = read.nextInt();
            number2 = read.nextInt();
            commonDigits = numberOfCommonDigits(number1, number2);

            if ((commonDigits != 0) && (commonDigits >= maxCommonDigits)) {
                maxCommonDigits = commonDigits;
                bestPair1 = number1;
                bestPair2 = number2;
            }
        }

        if (maxCommonDigits == 0) {
            System.out.println("sem resultados");
        } else {
            System.out.println(bestPair1 + "/" + bestPair2);
        }
    }

    //Função para contar a quantidade de dígitos comuns nas mesmas posições entre dois números
    public static int numberOfCommonDigits(int number1, int number2) {
        int digit1, digit2, commonDigits = 0;

        do {
            digit1 = number1 % 10;
            digit2 = number2 % 10;
            if (digit1 == digit2) {
                commonDigits++;
            }
            number1 /= 10;
            number2 /= 10;
        } while (number1 > 0 || number2 > 0);

        return commonDigits;
    }
}
