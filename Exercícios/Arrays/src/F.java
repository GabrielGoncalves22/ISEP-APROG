import java.util.Scanner;

//F - Aplicação financeira
public class F {
    static Scanner read = new Scanner(System.in);
    static final int NUMBER_MONTHS = 6;

    public static void main(String[] args) {
        double initialDeposit;
        double[] interestRates;

        interestRates = readInterestRates();
        initialDeposit = read.nextDouble();
        System.out.println("valor final=" + String.format("%.2f", showFinalAmount(interestRates, initialDeposit)));
    }

    //Função para ler as taxas de juro para cada um dos 6 meses
    public static double[] readInterestRates() {
        double[] interestRates = new double[NUMBER_MONTHS];

        for (int i = 0; i < interestRates.length; i++) {
            interestRates[i] = read.nextDouble();
        }

        return interestRates;
    }

    //Função para mostrar o montante final após os 6 meses de depósito
    public static double showFinalAmount(double[] interestRates, double initialDeposit) {
        double finalAmount = initialDeposit;

        for (int i = 0; i < interestRates.length; i++) {
            finalAmount += (finalAmount * interestRates[i]);
        }

        return finalAmount;
    }
}
