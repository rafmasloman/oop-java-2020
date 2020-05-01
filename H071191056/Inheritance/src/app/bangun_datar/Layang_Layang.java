package app.bangun_datar;

import app.BangunDatar;

public class Layang_Layang extends BangunDatar {
    private double panjangSisi1;
    private double panjangSisi2;
    private double diameter1;
    private double diameter2;

    public Layang_Layang(double panjangSisi1, double panjangSisi2, double diameter1, double diameter2){
        this.panjangSisi1 = panjangSisi1;
        this.panjangSisi2 = panjangSisi2;
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
    }
    @Override
    public double luas() {
        luas = 0.5 * (diameter1*diameter2);
        return luas;
    }

    @Override
    public double keliling() {
        keliling = 2 * (panjangSisi1 + panjangSisi2);
        return keliling;
    }

    public void infoLayangLayang() {
        System.out.println("\n---- DATA LAYANG-LAYANG ----");
        System.out.println("Luas Layang-layang: " + luas() + " cm");
        System.out.println("Keliling Layang-layang: " + keliling() + " cm" + "\n");
    }
}