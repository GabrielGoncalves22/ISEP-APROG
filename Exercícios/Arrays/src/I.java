import java.util.Scanner;

//I - Condomínio
public class I {
    static Scanner read = new Scanner(System.in);
    static final int MAX_FLOOR = 4;
    static final int MAX_ENTRY = 3;

    public static void main(String[] args) {
        String[][] building = new String[MAX_FLOOR][MAX_ENTRY];

        readBuilding(building);

        String resident = read.nextLine();
        searchResident(resident, building);
    }

    //Procedimento para ler o nome do proprietário de cada um dos apartamentos
    public static void readBuilding(String[][] building) {
        for (int entry = 0; entry < MAX_ENTRY; entry++) {
            for (int floor = 0; floor < MAX_FLOOR; floor++) {
                building[floor][entry] = read.nextLine();
            }
        }
    }

    //Procedimento para procurar e mostrar para um nome qual é a respetiva entrada e piso
    public static void searchResident(String resident, String[][] building) {
        boolean residentFound = false;

        for (int entry = 0; entry < MAX_ENTRY; entry++) {
            for (int floor = 0; floor < MAX_FLOOR; floor++) {
                if (building[floor][entry].equals(resident)) {
                    System.out.println("nome=" + resident);
                    System.out.println("entrada=" + entry);
                    System.out.println("piso=" + floor);
                    residentFound = true;
                }
            }
        }

        if (!residentFound) {
            System.out.println("Nao mora no predio");
        }
    }
}
