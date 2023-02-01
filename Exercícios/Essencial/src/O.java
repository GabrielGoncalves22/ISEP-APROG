import java.util.Scanner;

//O - Pizza
public class O {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numPizzas, pizzaClient, copyPizzaClient, pizzaMenu, copyPizzaMenu, digitPizzaClient, digitPizzaMenu, numberSuggestion = 0;
        boolean suggestedPizza;

        pizzaClient = read.nextInt();
        numPizzas = read.nextInt();

        for (int i = 0; i < numPizzas; i++) {

            pizzaMenu = read.nextInt();

            copyPizzaMenu = pizzaMenu;
            suggestedPizza = true;

            while (copyPizzaMenu > 0 && suggestedPizza) {
                copyPizzaClient = pizzaClient;
                digitPizzaMenu = copyPizzaMenu % 10;

                //Verificar cada digito da pizza do menu com a do cliente
                while (copyPizzaClient > 0 && suggestedPizza) {
                    digitPizzaClient = copyPizzaClient % 10;
                    if (digitPizzaMenu == digitPizzaClient) {
                        suggestedPizza = false;
                    }
                    copyPizzaClient /= 10;
                }

                copyPizzaMenu /= 10;
            }

            if (suggestedPizza) {
                numberSuggestion++;
                System.out.println("Sugestao #" + numberSuggestion + ":" + pizzaMenu);
            }
        }
    }
}
