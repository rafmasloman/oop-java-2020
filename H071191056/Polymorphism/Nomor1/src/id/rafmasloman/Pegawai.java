package id.rafmasloman;

public abstract class Pegawai implements Gaji{

    private double bonusStaff;
    private double bonusDosen;
    private double gajiPegawai;
    private String name;
    
    public Pegawai(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double gajiStaffTambahan() {
        this.bonusStaff = 50000;
        return bonusStaff;
    }

    public double gajiTambahanDosen() {
        this.bonusDosen = 120000;
        return bonusDosen;
    }

    public double getGajiAwal() {
        this.gajiPegawai = 2500000;
        return this.gajiPegawai;
    }

    @Override
    public abstract void hitungGaji();
    @Override
    public abstract void showInfo();
}
