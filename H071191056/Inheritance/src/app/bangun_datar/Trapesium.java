package app.bangun_datar;

import app.BangunDatar;

public class Trapesium extends BangunDatar{

    private double sisiSejajar1;
    private double sisiSejajar2;
    private double tinggi;

    public Trapesium(double sisiSejajar1,double sisiSejajar2,double tinggi){
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
    }
    @Override
    public double luas() {
        double jumlahSisi = sisiSejajar1 + sisiSejajar2;
        luas = jumlahSisi  * (0.5  * tinggi);
        return luas;
    }

    public void infoTrapesium() {
        System.out.println("\n---- DATA TABUNG ----");
        System.out.printf("Luas Permukaan Tabung = %.1f \n", luas());
       //! System.out.printf("Volume Tabung = %.2f \n\n", volume());
    }
}