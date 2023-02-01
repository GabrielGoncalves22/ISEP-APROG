import java.util.Scanner;

//E - Converter de base 8 para decimal
public class E {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numOctal = 0, numDecimal = 0, pos = 0, digito;

        numOctal = ler.nextInt();

        while (numOctal > 0) {

            do {
                digito = numOctal % 10;
                numDecimal += digito * Math.pow(8, pos);
                numOctal /= 10;
                pos++;
            } while (numOctal > 0);

            System.out.println(numDecimal);

            numOctal = ler.nextInt();
            numDecimal = 0;
            pos = 0;

        }
    }
}
