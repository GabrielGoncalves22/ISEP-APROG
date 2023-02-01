import java.util.Scanner;

//F - Volume de sólidos de revolução
public class F {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        String solid = read.next();
        double ray, height;

        do {
            ray = read.nextDouble();
            switch (solid) {
                case "esfera":
                    System.out.printf("%.2f\n", sphereVolume(ray));
                    break;
                case "cilindro":
                    height = read.nextDouble();
                    System.out.printf("%.2f\n", cylinderVolume(ray, height));
                    break;
                case "cone":
                    height = read.nextDouble();
                    System.out.printf("%.2f\n", coneVolume(ray, height));
                    break;
            }
            solid = read.next();
        } while (!solid.equals("fim"));
    }

    //Função para calcular o volume da esfera
    public static double sphereVolume(double ray) {
        return ((4 * Math.PI * Math.pow(ray, 3)) / 3);
    }

    //Função para calcular o volume do cilindro
    public static double cylinderVolume(double ray, double height) {
        return (Math.PI * Math.pow(ray, 2) * height);
    }

    //Função para calcular o volume do cone
    public static double coneVolume(double ray, double height) {
        return ((1 * Math.PI * Math.pow(ray, 2) * height) / 3);
    }
}
