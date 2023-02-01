import java.util.Scanner;

//L - Quantidade de palavras de uma frase
public class L {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String phrase = read.nextLine();

        System.out.println(amountWords(phrase));
    }

    //Função para contar o número de palavras existentes numa frase
    public static int amountWords(String phrase) {
        int amountWords = 0;
        boolean word = false;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                word = false;
            } else if (!word) {
                word = true;
                amountWords++;
            }
        }
        return amountWords;
    }
}
