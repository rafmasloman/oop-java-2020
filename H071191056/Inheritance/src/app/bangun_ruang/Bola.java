package app.bangun_ruang;

import app.BangunRuang;
/**
 * Bola
 */
public class Bola extends BangunRuang{
    private double pii;
    private double jari2;

    public Bola(double pii, double jari2) {
        this.pii = pii;
        this.jari2 = jari2;

    }

    @Override
    public double luasPermukaan() {
        luasPermukaan = 4 / 3 * (pii * Math.pow(jari2, 3));
        return luasPermukaan;
    }

    @Override
    public double volume() {
        volume = 4 * pii * Math.pow(jari2, 2);
        return volume;
    }

    public void infoBola() {
        System.out.println("\n---- DATA BOLA ----");
        System.out.println("Luas Permukaan Bola = " + luasPermukaan());
        System.out.println("Volume Bola = " + volume() + "\n");
    }
    
}