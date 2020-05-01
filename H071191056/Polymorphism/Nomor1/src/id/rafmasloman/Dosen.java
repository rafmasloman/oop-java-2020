package id.rafmasloman;

public class Dosen extends Pegawai{

    private double gajiDosen;
    private int jumlahSks;

    public Dosen(String name,int jumlahSks){
        super(name);
        this.jumlahSks = jumlahSks;
    }

    @Override
    public void hitungGaji() {
        this.gajiDosen = getGajiAwal() + (jumlahSks * gajiTambahanDosen());

    }

    @Override
    public void showInfo() {
        System.out.printf("%s mendapatkan gaji Rp. %.0f\n",getName(),gajiDosen);
    }
}
