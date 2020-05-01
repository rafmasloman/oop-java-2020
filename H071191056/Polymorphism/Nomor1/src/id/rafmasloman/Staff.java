package id.rafmasloman;

public class Staff extends Pegawai{
    private int jumlahKehadiran;
    public  double gajiStaff;

    public Staff(String name, int jumlahKehadiran){
        super(name);
        this.jumlahKehadiran = jumlahKehadiran;

    }

    @Override
    public void hitungGaji() {
        this.gajiStaff = getGajiAwal() + (jumlahKehadiran * gajiStaffTambahan());
    }

    @Override
    public void showInfo() {
        System.out.printf("%s mendapatkan gaji Rp. %.0f \n",getName(),gajiStaff);
    }

}
