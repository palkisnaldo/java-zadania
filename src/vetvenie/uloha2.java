/*Napíšte program na riešenie kvadratických rovníc (použite if, else if a else).
• ak D > 0, tak daná kvadratická rovnica má 2 rôzne reálne korene
• ak D = 0, tak daná kvadratická rovnica má dva rovnaké reálne korene,
čiže tzv. dvojnásobný reálny koreň
• ak D < 0, tak daná kvadratická rovnica nemá riešenie v obore reálnych
čísel (samozrejme v obore komplexných čísel má dva imaginárne
komplexne združené korene) */

package vetvenie;

import java.util.Scanner;

public class uloha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vstup a: ");
        double a = scanner.nextDouble();
        System.out.print("Vstup b: ");
        double b = scanner.nextDouble();
        System.out.print("Vstup c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Korene sú " + x1 + " a " + x2);
        }

        else if (D == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Koren je len jeden:  " + x1);
        }

        else {
            System.out.println("Rovnica nemá riešenie");
        }
        scanner.close();
    }
}