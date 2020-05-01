package app.bangun_ruang;

import app.BangunRuang;
/**
 * Tabung
 */
public class Tabung extends BangunRuang{
    private double diameter;
    private float pii;
    private double jari2;
    private double tinggi;

    public Tabung(double diameter, float pii,  double tinggi){
        this.diameter = diameter;
        this.pii = pii;
        this.tinggi = tinggi;
        jari2 = diameter / 2;
    }

    public double luasSelimut(){
        
        return 2 * pii * jari2 * tinggi;
    }

    public double luasAlas(){
        return pii * Math.pow(jari2, 2);
    }

    @Override
    public double luasPermukaan(){
        luasPermukaan = luasAlas() + luasSelimut();
        return luasPermukaan;
    }

    @Override
    public double volume(){
        volume = pii * (Math.pow(jari2, 2) * tinggi);
        return volume;
    }

    public void infoTabung(){
        System.out.println("\n---- DATA TABUNG ----");
        System.out.printf("Luas Permukaan Tabung = %.2f \n",luasPermukaan());
        System.out.printf("Volume Tabung = %.2f \n\n",volume());
    }
    
}