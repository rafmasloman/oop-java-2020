/**
 * Person
 */
public class Person {

    String name;
    int age;
    boolean isMale;

    

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {

        String laki2 = "Laki-laki";
        String perempuan = "Perempuan";

        if (isMale == true) {
            return laki2;
        } else {
            return perempuan;
        }

    }

}