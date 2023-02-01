import java.util.Scanner;

//B - Gráfico de classificações
public class B {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int numberStudents = read.nextInt();
        int numberSubjects = read.nextInt();

        for (int i = 0; i < numberSubjects; i++) {
            printInformationOfSubjects(numberStudents);
        }
    }

    //Procedimento para realizar a leitura do nome da disciplina e do número de alunos aprovados
    public static void printInformationOfSubjects(int numberStudents) {
        String nameSubjects = read.next();
        int approvedStudents = read.nextInt();

        System.out.println("Disciplina: " + nameSubjects);
        System.out.println("- Positivas: " + printString('*', approvedStudents));
        System.out.println("- Negativas: " + printString('*', numberStudents - approvedStudents));
    }

    //Função para criar uma string com um caracter de acordo com o número de alunos
    public static String printString(char c, int numberStudents) {
        String output = "";
        for (int i = 0; i < numberStudents; i++) {
            output += c;
        }

        return output;
    }
}
