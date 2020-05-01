package id.rafmasloman;

public class PegawaiUmum extends Pegawai{
    private double gajiPegawaiUmum;
    
    public PegawaiUmum(String name){
        super(name);
    }

    @Override
    public void hitungGaji() {
        this.gajiPegawaiUmum = getGajiAwal();
    }

    public double getGaji(){
        return gajiPegawaiUmum;
    }

    @Override
    public void showInfo() {
        System.out.printf("%s mendapatkan gaji Rp. %.0f\n", getName(), getGaji());
    }
    
}