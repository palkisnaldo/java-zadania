package es;

import java.util.Scanner;

public class automobily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte znacku auta: ");
        String znacka = scanner.nextLine();

        System.out.println("Zadajte model auta: ");
        String model = scanner.nextLine();

        System.out.println("Spotreba litrov na 100km: ");
        int spotreba = scanner.nextInt();

        System.out.println("Objem nadrze (litre): ");
        int objem = scanner.nextInt();

        System.out.println("Vzdialenost cesty: ");
        int cesta = scanner.nextInt();

        double spotrebaPaliva = (cesta / 100) * spotreba;
        int pocetNatankovani = (int) Math.ceil(spotrebaPaliva / objem);


        System.out.println("Značka automobilu: " + znacka);
        System.out.println("Model automobilu: " + model);
        System.out.println("Spotreba: " + spotreba + "l/100 km");
        System.out.println("Objem nádrže: " + objem + " litrov");
        System.out.println("Vzdialenosť cesty: " + cesta + " kilometrov");
        System.out.println("Celkova spotreba paliva: " + spotrebaPaliva + " l");
        System.out.println("pocet natankovani: " + pocetNatankovani);
    }
}
