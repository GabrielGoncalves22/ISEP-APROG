import java.util.Scanner;

//M - Converter uma frase para maiúsculas e minúsculas
public class M {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String phrase = read.nextLine();

        System.out.println(convertSentence(1, phrase));
        System.out.println(convertSentence(-1, phrase));
    }

    //Função para converter uma frase para maiúsculas ou minúsculas
    public static String convertSentence(int value, String phrase) {
        if (value > 0) {
            phrase = phrase.toUpperCase();
        } else if (value < 0) {
            phrase = phrase.toLowerCase();
        }
        return phrase;
    }
}
