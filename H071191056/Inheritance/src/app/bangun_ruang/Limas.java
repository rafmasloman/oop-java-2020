package app.bangun_ruang;

import app.BangunRuang;

public class Limas extends BangunRuang{
    private double tinggi, ts1, ts2;

    public Limas(double tinggi, double ts1, double ts2){
        this.tinggi = tinggi;
        this.ts1 = ts1;
        this.ts2 = ts2;
    }

    public double luasAlas(){
        double luasAlas = ts1 * ts2;
        return luasAlas;
    }

    public double luasSegitiga1(){
        double luasSegitiga1 = 0.5 *ts1 * tinggi;
        return luasSegitiga1;
    }

    public double luasSegitigas2(){
        double luasSegitigas2 = 0.5 *ts2 * tinggi;
        return luasSegitigas2;
    }

    @Override
    public double luasPermukaan() {
        luasPermukaan = luasAlas() + ((2*luasSegitiga1()) + (2 * luasSegitigas2()));
        return luasPermukaan;
    }

    @Override
    public double volume() {
        volume = 0.3 * luasAlas() * tinggi;
        return volume;
    }

    public void infoLimas() {
        System.out.println("\n---- DATA LIMAS ----");
        System.out.println("Luas Permukaan Limas = " + luasPermukaan());
        System.out.println("Volume Limas = " + volume() + "\n");
    }
}