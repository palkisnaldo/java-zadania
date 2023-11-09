/* Napíšte program, tak aby ste získali od používateľa číslo a následne zistili
        či je kladné alebo záporné.
        Vstupné číslo testovacích údajov : 35
        Očakávaný výstup :
        Číslo je kladne */

package vetvenie;

import java.util.Scanner;

public class uloha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte cislo: ");
        int cislo = scanner.nextInt();

        if (cislo > 0 ) {
           System.out.println("Cislo je kladne");
        }
        else if (cislo < 0 ) {
            System.out.println("Cislo je zaporne");
        }
        else {
           System.out.println("Cislo je nulove");
        }

        scanner.close();
    }
}
