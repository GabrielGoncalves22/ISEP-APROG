import java.util.Scanner;

//K - Substituir caracter numa frase
public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String phrase;
        char character1, character2;

        phrase = read.nextLine();
        character1 = read.next().charAt(0);
        character2 = read.next().charAt(0);

        System.out.println(replacePhrase(phrase, character1, character2));
    }

    //Função para substituir um caracter numa frase
    public static String replacePhrase(String phrase, char character1, char character2) {
        StringBuilder newPhrase = new StringBuilder(phrase);

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == character1) {
                newPhrase.setCharAt(i, character2);
            }
        }

        return newPhrase.toString();
    }
}
