package app;

/**
 * BangunRuang
 */
public class BangunRuang {

    protected double luasPermukaan;
    protected double volume;

    public double luasPermukaan() {
        System.out.println("---- LUAS PERMUKAAN ----");
        return luasPermukaan;
    }

    public double volume() {
        System.out.println("---- VOLUME ----");
        return volume;
    }
}