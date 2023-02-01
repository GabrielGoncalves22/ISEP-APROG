import java.util.Scanner;

//H - Rodar sequência
public class H {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int quantity = read.nextInt();

        executeCommands(readNumbers(quantity));
    }

    //Função para ler uma sequência de números inteiros
    public static int[] readNumbers(int quantity) {
        int[] arrayNumbers = new int[quantity];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = read.nextInt();
        }

        return arrayNumbers;
    }

    //Procedimento para executar os comandos de rotação do array
    public static void executeCommands(int[] arrayNumbers) {
        String command;

        do {
            do {
                command = read.next();
            } while (!command.equals("direita") && !command.equals("esquerda") && !command.equals("sair"));

            if (!command.equals("sair")) {
                switch (command) {
                    case "direita":
                        rotateRight(arrayNumbers);
                        break;
                    case "esquerda":
                        rotateLeft(arrayNumbers);
                        break;
                }
                writeArray(arrayNumbers);
            }
        } while (!command.equals("sair"));
    }

    //Procedimento para rodar uma posição a sequência de números para a direita
    public static void rotateRight(int[] arrayNumbers) {
        int temp = arrayNumbers[arrayNumbers.length - 1];
        for (int i = arrayNumbers.length - 1; i > 0; i--) {
            arrayNumbers[i] = arrayNumbers[i - 1];
        }
        arrayNumbers[0] = temp;
    }

    //Procedimento para rodar uma posição a sequência de números para a esquerda
    public static void rotateLeft(int[] arrayNumbers) {
        int temp = arrayNumbers[0];
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            arrayNumbers[i] = arrayNumbers[i + 1];
        }
        arrayNumbers[arrayNumbers.length - 1] = temp;
    }

    //Procedimento para escrever o array de números
    public static void writeArray(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("[" + arrayNumbers[i] + "]");
        }
        System.out.println();
    }
}
