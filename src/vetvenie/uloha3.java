//Vezmite od používateľa tri čísla a vypíšte najväčšie číslo

package vetvenie;

import java.util.Scanner;

public class uloha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double c1 = scanner.nextDouble();
        System.out.print("Zadajte druhé číslo: ");
        double c2 = scanner.nextDouble();
        System.out.print("Zadajte tretie číslo: ");
        double c3 = scanner.nextDouble();

        double najvacsie = c1;

        if (c2 > najvacsie) {
            najvacsie = c2;
        }

        if (c3 > najvacsie) {
            najvacsie = c3;
        }

        System.out.println("Najväčšie číslo je: " + najvacsie);

        scanner.close();
    }
}

