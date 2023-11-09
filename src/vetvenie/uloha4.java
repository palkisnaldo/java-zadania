/* 4. Napíšte program, ktorý prečíta číslo s desatinnou čiarkou a vypíše "nula",
ak je číslo nula. V opačnom prípade výpise „pozitívne číslo“ alebo „negatívne
číslo“. Pridajte „malé“, ak je absolútna hodnota čísla menšia ako 1, alebo
„veľké“, ak je väčšia 1 000 000. */


package vetvenie;

import java.util.Scanner;

public class uloha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo s desatinnou čiarkou: ");
        double cislo = scanner.nextDouble();

        if (cislo == 0) {
            System.out.println("Nula");
        }

        else if (Math.abs(cislo) < 1) {
            System.out.println("Malé" + (cislo > 0 ? "pozitívne" : "negatívne") + " číslo");
        }

        else if (cislo > 1000000 || cislo < -1000000) {
            System.out.println("Veľké " + (cislo > 0 ? "pozitívne" : "negatívne") + " číslo");
        }

        else {
            System.out.println((cislo > 0 ? "Pozitívne" : "Negatívne") + " číslo");
        }

        scanner.close();
    }
}

