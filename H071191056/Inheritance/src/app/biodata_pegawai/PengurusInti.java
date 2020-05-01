package app.biodata_pegawai;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * PengurusInti
 */
public class PengurusInti extends Anggota{

    private String jabatan;
    private String dateOfBirth;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public PengurusInti(String name, int age, int registerYear, String jabatan){
        super(name,age, registerYear);
        this.jabatan = jabatan;
    }

    public void setFaculty(String faculty){
        super.faculty = faculty;
    }

    public void setMajor(String major){
        super.major = major;
    }
    
    public void setDate(int tanggaLahir, int bulanLahir, int tahunLahir){
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        dateOfBirth = String.valueOf(tanggaLahir + "-" + bulanLahir + "-" + tahunLahir);
    }

    public String getDate(){
        return dateOfBirth;
    }

    public int showInfo(){
        System.out.println("Nama\t\t: " + getName());
        System.out.println("Tanggal Lahir\t: " + getDate());
        System.out.println("Umur\t\t: " + getAge());
        System.out.println("NIM\t\t: " + getNim());
        System.out.println("Fakultas\t: " + faculty);
        System.out.println("Program Studi\t: " + major);
        System.out.println("Jabatan\t\t: " + jabatan + "\n");
        return 0;
    }
}