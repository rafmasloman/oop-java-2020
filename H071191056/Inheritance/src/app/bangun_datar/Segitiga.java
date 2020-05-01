package app.bangun_datar;

import app.BangunDatar;

/**
 * Segitiga
 */
public class Segitiga extends BangunDatar{

    private double alas;
    private double tinggi;
    private double sisiA,sisiB,sisiC;

    public Segitiga(double alas,double tinggi){

    }

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double luas(){
        luas = (this.alas * this.tinggi) / 2;
        return luas;
    }
    @Override
    public double keliling(){
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public void infoSegitiga(){
        System.out.println("\n---- DATA SEGITIGA ----");
        System.out.println("Luas Segitiga: " + luas() + " cm");
        System.out.println("Keliling Segitiga: " + keliling() + " cm" + "\n");
    }
}