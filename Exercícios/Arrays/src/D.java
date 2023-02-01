import java.util.Scanner;

//D - Frequências das notas
public class D {
    static Scanner read = new Scanner(System.in);
    static final int NUMBER_GRADES = 21;

    public static void main(String[] args) {
        int numberStudents = read.nextInt();
        frequencyValues(frequencyGrades(readStudentGrades(numberStudents)));
    }

    //Função para ler e armazenar as notas dos alunos
    public static int[] readStudentGrades(int numberStudents) {
        int[] arrayGrades = new int[numberStudents];

        for (int i = 0; i < arrayGrades.length; i++) {
            arrayGrades[i] = read.nextInt();
        }

        return arrayGrades;
    }

    //Função para determinar as frequências das notas (zero a vinte)
    public static int[] frequencyGrades(int[] arrayGrades) {
        int[] arrayFrequencyGrades = new int[NUMBER_GRADES];

        for (int i = 0; i < arrayGrades.length; i++) {
            arrayFrequencyGrades[arrayGrades[i]]++;
        }

        return arrayFrequencyGrades;
    }

    //Procedimento para mostrar os valores das frequências
    public static void frequencyValues(int[] arrayAttendGrades) {
        for (int i = 0; i < arrayAttendGrades.length; i++) {
            System.out.println(i + " " + arrayAttendGrades[i]);
        }
    }
}
