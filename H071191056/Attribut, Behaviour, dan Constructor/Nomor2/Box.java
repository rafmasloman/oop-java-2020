package Nomor2;

/**
 * Box
 */
public class Box {

    private double widht;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double widht, double height, double depth){
        this.widht = widht;
        this.height = height;
        this.depth = depth;

    }

    public void setWidht(double widht){
        this.widht = widht;

    }
    
    public void setHeight(double height) {
        this.height = height;
        
    }
    public void setDepth(double depth){
        this.depth = depth;
        
        
    }
    
    public void setMass(double mass) {
        this.mass = mass;

    }

    public double getDensity(){
        double volumeBox = widht * height * depth;
        density = mass / volumeBox;
        return density;
    }

}