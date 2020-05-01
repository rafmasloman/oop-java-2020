package app.biodata_pegawai;

import java.util.HashMap;
import java.util.Random;

/**
 * Anggota
 */
public class Anggota {

    private String name;
    private int age;
    private String nim;
    private int registerYear;
    private Random random;
    
    public String faculty;
    public String major;

    public Anggota(String name, int age, int registerYear){
        this.name = name;
        this.age = age;
        this.registerYear = registerYear;
    }

    public void setNim(HashMap<String,String> faculty, HashMap<String, String> major){
      String toStringRY = String.valueOf(registerYear);
      String registerYear2 = toStringRY.substring(2, 4);
      random = new Random();
      int getAngka = 01 + random.nextInt(060);
      if (getAngka <= 9) {
          nim  = faculty.get(this.faculty) + major.get(this.major) + 1 + registerYear2 + 1 + "00" + getAngka;
      }  
      else if(getAngka > 9){
          nim = faculty.get(this.faculty) + major.get(this.major) + 1 + registerYear2 + "1" + "0" + getAngka;
      }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getNim(){
        return nim;
    }

    public int getResgisterYear(){
        return registerYear;
    }

}