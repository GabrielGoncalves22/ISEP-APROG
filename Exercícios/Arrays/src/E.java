import java.util.Scanner;

//E - Estatísticas de vencimentos
public class E {
    static Scanner read = new Scanner(System.in);
    static final int MAX_EMPLOYEE = 20;

    public static void main(String[] args) {
        String[] nameEmployees = new String[MAX_EMPLOYEE];
        double[] salaryEmployees = new double[MAX_EMPLOYEE];
        int numberEmployees = readNameSalaryEmployees(nameEmployees, salaryEmployees);

        showResults(salaryEmployees, nameEmployees, numberEmployees, averageSalary(salaryEmployees, numberEmployees));
    }

    //Função para ler os nomes e vencimentos dos funcionários da empresa e retornar o número de funcionários
    public static int readNameSalaryEmployees(String[] nameEmployees, double[] salaryEmployees) {
        String name;
        int numberEmployees = 0;

        do {

            name = read.next();

            if (!name.equals("fim")) {
                nameEmployees[numberEmployees] = name;
                salaryEmployees[numberEmployees] = read.nextDouble();

                numberEmployees++;
            }

        } while (!name.equals("fim") && MAX_EMPLOYEE > numberEmployees);

        return numberEmployees;
    }

    //Função para calcular a média dos vencimentos
    public static double averageSalary(double[] salaryEmployees, int numberEmployees) {
        double sumSalary = 0;
        for (int i = 0; i < numberEmployees; i++) {
            sumSalary += salaryEmployees[i];
        }

        return (sumSalary / numberEmployees);
    }

    //Procedimento para mostrar os resultados
    public static void showResults(double[] salaryEmployees, String[] nameEmployees, int numberEmployees, double averageSalary) {
        System.out.println(String.format("%.1f", averageSalary));

        for (int i = 0; i < numberEmployees; i++) {
            if (averageSalary > salaryEmployees[i]) {
                System.out.println(nameEmployees[i]);
            }
        }
    }
}
