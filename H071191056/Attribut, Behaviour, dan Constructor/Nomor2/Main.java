package Nomor2;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double widht = raf.nextDouble();
        double height = raf.nextDouble();
        double depth = raf.nextDouble();
        double mass = raf.nextDouble();
        Box box = new Box(widht, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());
        box.setMass(mass * 2);
        System.out.println("Massa jenis = " + box.getDensity());
    }
}