import java.util.Scanner;

public class J {
    static Scanner read = new Scanner(System.in);
    static final int MAX_EMPLOYEE = 100;
    static final int TOP = 3;

    public static void main(String[] args) {
        String[] nameEmployees = new String[MAX_EMPLOYEE];
        double[] salaryEmployees = new double[MAX_EMPLOYEE];

        int numberEmployees = readNameSalaryEmployees(nameEmployees, salaryEmployees);

        viewTop(nameEmployees, salaryEmployees, topSalary(salaryEmployees, numberEmployees), numberEmployees);
    }

    public static int readNameSalaryEmployees(String[] nameEmployees, double[] salaryEmployees) {
        String name;
        int numberEmployees = 0;

        do {
            name = read.nextLine();

            if (!name.equals("FIM")) {
                nameEmployees[numberEmployees] = name;
                salaryEmployees[numberEmployees] = read.nextDouble();
                read.nextLine();
                numberEmployees++;
            }
        } while (!name.equals("FIM") && MAX_EMPLOYEE > numberEmployees);

        return numberEmployees;
    }

    public static double[] topSalary(double[] salaryEmployees, int numberEmployees) {
        double[] maxValues = new double[TOP];

        for (int i = 0; i < salaryEmployees.length; i++) {
            if (salaryEmployees[i] > maxValues[0]) {
                maxValues[2] = maxValues[1];
                maxValues[1] = maxValues[0];
                maxValues[0] = salaryEmployees[i];
            } else if (salaryEmployees[i] > maxValues[1]) {
                maxValues[2] = maxValues[1];
                maxValues[1] = salaryEmployees[i];
            } else if (salaryEmployees[i] > maxValues[2]) {
                maxValues[2] = salaryEmployees[i];
            }
        }
        return maxValues;
    }

    public static void viewTop(String[] nameEmployees, double[] salaryEmployees, double[] topSalary, int numberEmployees) {
        int order = 0;
        for (int i = 0; i < numberEmployees; i++) {
            for (int j = 0; j < topSalary.length; j++) {
                if (topSalary[i] == salaryEmployees[j] && order < 3) {
                    System.out.println("#" + order + ":" + nameEmployees[i] + ":" + salaryEmployees[i]);
                    order++;
                }
            }
        }
    }


}
