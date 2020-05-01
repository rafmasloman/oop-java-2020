package app.bangun_ruang;

import app.BangunRuang;
/**
 * PrismaSegitiga
 */
public class PrismaSegitiga extends BangunRuang{
    
    private double tinggiPS;
    private double tinggi;
    private double alas;

    public PrismaSegitiga(double tinggi, double alas, double tinggiPS){
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPS = tinggiPS;
    }
    
    public double luasSelimut(){
        return 3 * tinggi * tinggiPS;
    }

    public double luasAlas(){
        return (this.alas * this.tinggi) / 2;
    }

    @Override
    public double luasPermukaan(){
        luasPermukaan = luasSelimut() + (2 * luasAlas());
        return luasPermukaan;
    }

    @Override
    public double volume(){
        return luasAlas() * tinggiPS;
    }

    public void infoPrismaSegitiga(){
        System.out.println("\n---- DATA PRISMA SEGITIGA ----");
        System.out.println("Luas Permukaan Prisma Segitiga = " + luasPermukaan());
        System.out.println("Volume Prisma Segitiga = " + volume() + "\n");
    }
     

}