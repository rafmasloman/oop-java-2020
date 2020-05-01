package app.bangun_datar;

import app.BangunDatar;
/**
 * Lingkaran
 */
public class Lingkaran extends BangunDatar{

    private double pii;
    private double jari2;


    public Lingkaran(double pii, double jari2){
        this.pii = pii;
        this.jari2 = jari2;
    }

    @Override
    public double luas(){
        luas = this.pii * Math.pow(this.jari2, 2);
        return luas;
    }

    @Override
    public double keliling(){
        keliling = 2 * this.pii * this.jari2;
        return keliling;
    }

    public void infoLingkaran() {
        System.out.println("\n---- DATA LINGKARAN ----");
        System.out.println("Luas Lingkaran: " + luas() + " cm");
        System.out.println("Keliling Lingkaran: " + keliling() + " cm" + "\n");
    }
}