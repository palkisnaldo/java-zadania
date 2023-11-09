/*2. Napíšte metódu na výpočet priemeru troch čísel.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 45
Zadajte tretie číslo: 65
Očakávaný výstup:
Priemerná hodnota je 45.0
*/

package metody;

import java.util.Scanner;

public class uloha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        uloha2 obj = new uloha2();

        System.out.print("Zadajte prve cislo: ");
        int prve = sc.nextInt();

        System.out.print("Zadajte druhe cislo: ");
        int druhe = sc.nextInt();

        System.out.print("Zadajte tretie cislo: ");
        int tretie = sc.nextInt();

        System.out.println("Priemer tychto cisel je: " + obj.priemer(prve, druhe, tretie));
    }
        int s;
        public int priemer(int a, int b, int c) {
            s = (a + b + c) /3;
            return s;
        }

}
