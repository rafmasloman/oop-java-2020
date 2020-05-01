package app.bangun_datar;

import app.BangunDatar;
/**
 * PersegiPanjang
 */
public class PersegiPanjang extends BangunDatar{

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas(){
        luas = this.panjang * this.lebar;
        return luas;
    }

    @Override
    public double keliling(){
        keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }

    public void infoPersegiPanjang(){
        System.out.println("\n---- DATA PERSEGI PANJANG ----");
        System.out.println("Luas Persegi Panjang: " + luas() + " cm");
        System.out.println("Keliling Persegi Panjang: " + keliling() + " cm" + "\n");
    }
}