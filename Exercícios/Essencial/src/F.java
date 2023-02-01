import java.util.Scanner;

//F - Capicua
public class F {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numOriginal = 0, numCopia = 0, numFinal = 0, dig;

        while (numOriginal <= 0) {
            numOriginal = ler.nextInt();
            numCopia = numOriginal;
        }

        do {
            dig = numCopia % 10;
            numFinal = numFinal * 10 + dig;
            numCopia /= 10;
        } while (numCopia > 0);

        if (numOriginal == numFinal) {
            System.out.println("capicua");
        } else {
            System.out.println("nao capicua");
        }
    }
}
