import java.util.Scanner;

//D - Combinações e permutações
public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int m = read.nextInt(), n = read.nextInt();

        if (m >= n) {
            System.out.println("C(" + m + "," + n + ")=" + combinations(m, n));
            System.out.println("P(" + m + "," + n + ")=" + permutations(m, n));
        }
    }

    //Função para realizar a quantidade de combinações possíveis
    public static int combinations(int m, int n) {
        return (factorial(m) / (factorial(n) * (factorial(m - n))));
    }

    //Função para realizar a quantidade de permutações possíveis
    public static int permutations(int m, int n) {
        return (factorial(m) / (factorial(m - n)));
    }

    //Função para calcular o fatorial de um número
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
