import java.util.Scanner;

//X - Palíndromo
public class X {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(countWords());
    }

    //Função para contar o número de palavras lidas que antecedem o palíndromo
    public static int countWords() {
        int countWords = 0;
        String word;
        boolean palindrome = false;

        do {
            word = read.next();
            if (palindrome(word)) {
                palindrome = true;
            } else {
                countWords++;
            }
        } while (!palindrome);

        return countWords;
    }

    //Função para verificar se uma palavra é um palíndromo
    public static boolean palindrome(String word) {
        String newWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }

        return (word.equalsIgnoreCase(newWord));
    }
}
