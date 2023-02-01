import java.util.Scanner;

//C - Calcular ângulos de um triângulo
public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble(), b = read.nextDouble(), c = read.nextDouble();

        if (checkTriangle(a, b, c)) {
            System.out.println("a=" + String.format("%.2f", a));
            System.out.println("b=" + String.format("%.2f", b));
            System.out.println("c=" + String.format("%.2f", c));
            System.out.println("ang(a,b)=" + String.format("%.2f", calculateAngles(a, b, c)));
            System.out.println("ang(a,c)=" + String.format("%.2f", calculateAngles(a, c, b)));
            System.out.println("ang(b,c)=" + String.format("%.2f", calculateAngles(b, c, a)));
        } else {
            System.out.println("impossivel");
        }
    }

    //Função para calcular um ângulo interno de um triângulo
    public static double calculateAngles(double a, double b, double c) {
        return (Math.toDegrees(Math.acos(((Math.pow(a, 2)) + (Math.pow(b, 2)) - (Math.pow(c, 2))) / (2 * a * b))));
    }

    //Função para verificar se as medidas de um triângulo são válidas
    public static boolean checkTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a);
    }
}
