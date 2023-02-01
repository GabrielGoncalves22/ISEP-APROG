import java.util.Scanner;

//C - Produto dos algarismos impares
public class C {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0, produtoImpares = 1, digito;
        boolean existeImpares = false;

        while (numero <= 0) {
            numero = ler.nextInt();
        }

        do {
            digito = numero % 10;
            if (digito % 2 != 0) {
                produtoImpares *= digito;
                existeImpares = true;
            }
            numero /= 10;
        } while (numero > 0);

        if (existeImpares) {
            System.out.println(produtoImpares);
        } else {
            System.out.println("nao ha algarismos impares");
        }
    }
}
