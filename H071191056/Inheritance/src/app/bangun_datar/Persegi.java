package app.bangun_datar;

import app.BangunDatar;
/**
 * Persegi
 */
public class Persegi extends BangunDatar{

    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double luas(){
        luas = Math.pow(sisi, 2);
        return luas;
    }

    @Override
    public double keliling(){
        keliling = 4 * sisi;
        return keliling;

    }

    public void infoPersegi(){

        System.out.println("\n---- DATA PERSEGI ----");
        System.out.println("Luas Persegi : " + luas() + " cm");
        System.out.println("Keliling Persegi : " + keliling() + " cm" + "\n");

    }
}