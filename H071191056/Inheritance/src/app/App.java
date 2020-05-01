package app;

import java.util.Scanner;

//? Import class bangun_ruang
import app.bangun_ruang.Kubus;
import app.bangun_ruang.Limas;
import app.bangun_ruang.Balok;
import app.bangun_ruang.PrismaSegitiga;
import app.bangun_ruang.Bola;
import app.bangun_ruang.Kerucut;
import app.bangun_ruang.Tabung;

//*Import class bangun_datar
import app.bangun_datar.*;

public class App {
    private static Scanner raf = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    boolean cek = true;
    while(cek){
        System.out.println("-------- MENU UTAMA --------");
        System.out.println("1. BANGUN RUANG ");
        System.out.println("2. BANGUN DATAR");
        System.out.print(">>>");
        int pilihBangun = raf.nextInt();
            switch (pilihBangun) {
                case 1:
                    MenuBangunRuang();
                    break;
                case 2:
                    MenuBangunDatar();
                    break;
                default:
                    break;
                }
            System.out.println("Try Again ? (Yes/No)");
            String cek2 = raf.next();
            if (cek2.equalsIgnoreCase("No")) {
                System.out.println("Thanks For using our Product");
                cek = false;
            }
            else if(cek2.equalsIgnoreCase("Yes")){
                cek = true;
            }
            else{
                System.out.println("Inputan Tidak Valid");
                System.exit(0);
            }
            
        }
    }
    public static void MenuBangunRuang() {
        System.out.println("------- BANGUN RUANG -------");
        System.out.println("1.\tKUBUS");
        System.out.println("2.\tBALOK");
        System.out.println("3.\tPRISMA SEGITIGA");
        System.out.println("4.\tBOLA");
        System.out.println("5.\tTABUNG");
        System.out.println("6.\tKERUCUT");
        System.out.println("7. \tLIMAS");
        System.out.print(">>> ");
        int pilihBR = raf.nextInt();
        switch (pilihBR) {
            case 1:
                System.out.print("Masukkan Sisi Kubus : ");
                double sisi = raf.nextDouble();
                Kubus kubus = new Kubus(sisi);
                kubus.infoKubus();
                break;
            case 2:
                System.out.print("Masukkan panjang Balok : ");
                double panjang = raf.nextDouble();
                System.out.print("Masukkan Lebar Balok: ");
                double lebar = raf.nextDouble();
                System.out.print("Masukkan Tinggi Balok: ");
                double tinggiBalok = raf.nextDouble();
                Balok balok = new Balok(panjang, lebar, tinggiBalok);
                balok.infoBalok();
                break;
            case 3:
                System.out.print("Masukkan Alas : ");
                double alas = raf.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggi = raf.nextDouble();
                System.out.print("Masukkan Tinggi Prisma Segitiga : ");
                double tinggiPS = raf.nextDouble();
                PrismaSegitiga prismaSegitiga = new PrismaSegitiga(tinggi, alas, tinggiPS);
                prismaSegitiga.infoPrismaSegitiga();
                break;
            case 4:
                System.out.print("Masukkan Jari-jari : ");
                double jari2 = raf.nextDouble();
                Bola bola = new Bola(3.14, jari2);
                bola.infoBola();
                break;
            case 5:
                System.out.print("Masukkan Diamater : ");
                double diameter = raf.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                tinggi = raf.nextDouble();
                Tabung tabung = new Tabung(diameter, 3.14f , tinggi);
                tabung.infoTabung();
                break;
            case 6:
                System.out.print("Masukkan Tinggi : ");
                tinggi = raf.nextDouble();
                System.out.print("Masukkan Jari-jari : ");
                jari2 = raf.nextDouble();
                Kerucut kerucut = new Kerucut(tinggi, jari2);
                kerucut.infoKerucut();
                break;
            case 7:
                System.out.println("Masukkan SisiSegitiga1 : ");
                double ts1 = raf.nextDouble();
                System.out.println("Masukkan SisiSegitigas2 : ");
                double ts2 = raf.nextDouble();
                System.out.println("Masukkan Tinggi : ");
                tinggi = raf.nextDouble();
                Limas limas = new Limas(tinggi, ts1, ts2);
                limas.infoLimas();
                break;
            default:
                break;
        }
    }
    public static void MenuBangunDatar(){
        System.out.println("------- BANGUN DATAR -------");
        System.out.println("1.\tPERSEGI");
        System.out.println("2.\tPERSEI PANJANG");
        System.out.println("3.\tSEGITIGA");
        System.out.println("4.\tLINGKARAN");
        System.out.println("5.\tTRAPESIUM");
        System.out.println("6.\tLAYANG-LAYANG");
        System.out.println("7. \tBELAH KETUPAT");
        System.out.println("8 \t JAJAR GENJANG");
        System.out.print(">>> ");
        int pilihBD = raf.nextInt();
        switch (pilihBD) {
            case 1:
                System.out.print("Masukkan Sisi : ");
                double sisi = raf.nextDouble();
                Persegi persegi = new Persegi(sisi);
                persegi.infoPersegi();                
                break;
            case 2:
                System.out.print("Masukkan Panjang : ");
                double panjang = raf.nextDouble();
                System.out.print("Masukkan Lebar : ");
                double lebar = raf.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                persegiPanjang.infoPersegiPanjang();
                break;
            case 3:
                System.out.print("Masukkan Alas : ");
                double alas = raf.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggi = raf.nextDouble();
                System.out.print("Masukkan sisi A, B dan C: ");
                double sisiA,sisiB,sisiC;
                sisiA = raf.nextDouble();
                sisiB = raf.nextDouble();
                sisiC = raf.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi, sisiA,sisiB,sisiC);
                segitiga.infoSegitiga();
                break;
            case 4:
                System.out.print("Masukkan Jari-jari : ");
                double jari2 = raf.nextDouble();
                Lingkaran lingkaran = new Lingkaran(3.14, jari2);
                lingkaran.infoLingkaran();
                break;
            case 5:
                System.out.print("Masukkan Sisi sejajar1 : ");
                double s1 = raf.nextDouble();
                System.out.print("Masukkan Sisi sejajar2 : ");
                double s2 = raf.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggiTrap = raf.nextDouble();
                Trapesium trapesium = new Trapesium(s1, s2, tinggiTrap);
                trapesium.infoTrapesium();
                break;
            case 6: 
                System.out.println("Masukkan Diameter 1 : ");
                double diameter1 = raf.nextDouble();
                System.out.println("Masukkan Diameter 2 : ");
                double diameter2 = raf.nextDouble();
                System.out.println("Masukkan Panjang Sisi1 : ");
                double panjangSisi1 = raf.nextDouble();
                System.out.println("Masukkan Panjang Sisi2 : ");
                double panjangSisi2 = raf.nextDouble();
                Layang_Layang layang2 = new Layang_Layang(panjangSisi1, panjangSisi2, diameter1, diameter2);
                layang2.infoLayangLayang();
                break;
            case 7:
                System.out.println("Masukkan Diameter 1 : ");
                diameter1 = raf.nextDouble();
                System.out.println("Masukkan Diameter 2 : ");
                diameter2 = raf.nextDouble();
                System.out.print("Masukkan Sisi : ");
                sisi = raf.nextDouble();
                BelahKetupat bk = new BelahKetupat(diameter1, diameter2, sisi);
                bk.infoBK();
                break;
            case 8:
                System.out.print("Masukkan Tinggi : ");
                tinggi = raf.nextDouble();
                System.out.print("Masukkan a : ");
                double a = raf.nextDouble();
                System.out.print("Masukkan b : ");
                double b = raf.nextDouble();
                JajarGenjang jg = new JajarGenjang(a, b, tinggi);
                jg.infoJG();
                break;
            default:
                break;
        }
    }
}
