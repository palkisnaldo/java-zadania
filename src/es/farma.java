package es;

import java.util.Random;

public class farma {
    public static void main(String[] args) {
        Random generator = new Random();
        int plodiny = generator.nextInt(100)+1;
        String[] typy = {"ovocie", "zelenina", "obilnina"};
        String typ = typy[generator.nextInt(typy.length)];
        double uroda = generator.nextDouble() * 100;
        double celkova = (uroda * plodiny);

        System.out.println("Pocet plodin " + plodiny);
        System.out.println("Typ " + typ);
        System.out.printf("uroda na 1 plodinu: %.2f kg%n", uroda);
        System.out.printf("celkova uroda: %.2f kg%n", celkova);
    }
}
