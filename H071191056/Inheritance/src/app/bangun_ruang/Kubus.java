package app.bangun_ruang;

import app.BangunRuang;
/**
 * Kubus
 */
public class Kubus extends BangunRuang{

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasPermukaan() {
        luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }

    @Override
    public double volume() {
        volume = Math.pow(sisi, 3);
        return volume;
    }

    public void infoKubus() {
        System.out.println("\n---- DATA KUBUS ----");
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan());
        System.out.println("Volume Kubus = " + volume() + "\n");
    }
}