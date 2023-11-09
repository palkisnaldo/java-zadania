/* 1. Napíšte metódu na nájdenie najmenšieho čísla medzi tromi číslami.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 37
Zadajte tretie číslo: 29
Očakávaný výstup:
Najmenšia hodnota je 25.0 */

package metody;

import java.util.Scanner;

public class uloha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double prve = sc.nextDouble();

        System.out.print("Zadajte druhé číslo: ");
        double druhe = sc.nextDouble();

        System.out.print("Zadajte tretie číslo: ");
        double tretie = sc.nextDouble();

        double najmensie = najmensieCislo(prve, druhe, tretie);
        System.out.println("Najmenšia hodnota je " + najmensie + ".");
    }

    public static double najmensieCislo(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
