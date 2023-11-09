/* Napíšte program, ktorý načíta číslo od používateľa medzi 1 a 7 a zobrazí
názov dňa v týždni. */


package vetvenie;

import java.util.Scanner;

public class uloha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();

        if (cislo == 1) {
            System.out.println("Pondelok");
        }
        else if (cislo == 2) {
            System.out.println("Utorok");
        }
        else if (cislo == 3) {
            System.out.println("Streda");
        }
        else if (cislo == 4) {
            System.out.println("Stvrtok");
        }
        else if (cislo == 5) {
            System.out.println("Piatok");
        }
        else if (cislo == 6) {
            System.out.println("Sobota");
        }
        else if (cislo == 7) {
            System.out.println("Nedela");
        }
        else {
            System.out.println("zadal si zle cislo");
        }

        scanner.close();
    }
}
