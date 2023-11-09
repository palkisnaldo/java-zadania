//Napíšte program, ktorý načíta dve čísla s desatinnou čiarkou a otestuje, či
// sú rovnaké až na tri desatinné miesta.

package vetvenie;

import java.util.Scanner;

public class uloha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double c1 = scanner.nextDouble();
        System.out.print("Zadajte druhé číslo: ");
        double c2 = scanner.nextDouble();

        if (c1 == c2) {
            System.out.println("cisla su rovnake");
        }
        else {
            System.out.println("cisla nie su rovnake");
        }
    }
}
