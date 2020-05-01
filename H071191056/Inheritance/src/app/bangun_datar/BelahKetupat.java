package app.bangun_datar;

import app.BangunDatar;

public class BelahKetupat extends BangunDatar{
    private double d1;
    private double d2;
    private double sisi;

    public BelahKetupat(double d1, double d2, double sisi){
        this.d1 = d1;
        this.d2 = d2;
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        luas = 0.5 * d1 *d2;
        return luas;
    }

    @Override
    public double keliling() {
        keliling = sisi * 4;
        return keliling;
    }

    public void infoBK(){
        System.out.println("----- DATA BK -----");
        System.out.println("Luas BK: " + luas() + " cm");
        System.out.println("Keliling BK: " + keliling() + " cm" + "\n");
    }

}