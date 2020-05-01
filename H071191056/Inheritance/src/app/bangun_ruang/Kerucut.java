package app.bangun_ruang;

import app.BangunRuang;

public class Kerucut extends BangunRuang{
    private double tinggi;
    private double jari2;
    private final double pii = 3.14;

    public Kerucut(double tinggi, double jari2) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        double s = Math.sqrt(jari2) + Math.sqrt(tinggi);
        luasPermukaan = pii * (jari2 + s);
        return luasPermukaan;
    }

    @Override
    public double volume() {
        volume = 0.3 * pii * Math.sqrt(jari2) * tinggi;
        return volume;
    }

    public void infoKerucut() {
        System.out.println("\n---- DATA KERUCUT ----");
        System.out.printf("Luas Permukaan Kerucut = %.2f",luasPermukaan());
        System.out.printf("\nVolume Kerucut = %.2f\n",volume());
    }
}