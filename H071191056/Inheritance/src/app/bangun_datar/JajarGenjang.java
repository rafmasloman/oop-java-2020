package app.bangun_datar;

import app.BangunDatar;

public class JajarGenjang extends BangunDatar{
    private double a,b,tinggi;
    
    public JajarGenjang(double a,double b,double tinggi){
        this.a = a;
        this.b = b;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        luas = a * tinggi;
        return luas;
    }

    @Override
    public double keliling() {
        keliling = 2 * (a + b);
        return keliling;
    }

    public void infoJG() {
        System.out.println("----- DATA JG -----");
        System.out.println("Luas JG: " + luas() + " cm");
        System.out.println("Keliling JG: " + keliling() + " cm" + "\n");
    }
}