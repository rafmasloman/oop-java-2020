package app.bangun_ruang;

import app.BangunRuang;

/**
 * Balok
 */
public class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luasPermukaan;
    }

    @Override
    public double volume() {
        volume = panjang * lebar * tinggi;
        return volume;
    }

    public void infoBalok() {
        System.out.println("\n---- DATA BALOK ----");
        System.out.println("Luas Permukaan Balok = " + luasPermukaan());
        System.out.println("Volume Balok = " + volume() + "\n");

    }
    
}