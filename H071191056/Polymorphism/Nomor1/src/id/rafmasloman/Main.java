package id.rafmasloman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner raf = new Scanner(System.in);

        //Input Dosen
        System.out.print("Nama Dosen\t\t ::> ");
        String name = raf.nextLine();
        System.out.print("Jumlah SKS\t\t ::> ");
        int sks = raf.nextInt();

        raf.nextLine();

        //Input Staff
        System.out.print("Nama Staff\t\t ::> ");
        String staffName = raf.nextLine();
        System.out.print("Jumlah Kehadiran ::> ");
        int kehadiran = raf.nextInt();

        raf.nextLine();
        //Input Pegawai
        System.out.print("Nama Pegawai\t ::> ");
        String namaPegawai = raf.nextLine();

        Pegawai[] crew = {new Dosen(name,sks),
                        new Staff(staffName,kehadiran),
                        new PegawaiUmum(namaPegawai)};

        for (int i = 0; i < crew.length; i++){
            
            crew[i].hitungGaji();
            crew[i].showInfo();
        }


    }
}
