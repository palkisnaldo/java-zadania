package es;

import java.util.Random;

public class farma {
    public static void main(String[] args) {
        Random generator = new Random();
        int plodiny = generator.nextInt(100)+1;
        String[] typy = {"ovocie", "zelenina", "obilnina"};
        String typ = typy[generator.nextInt(typy.length)];
        double uroda = generator.nextDouble() * 100;

        System.out.println("Pocet plodin");
    }
}
