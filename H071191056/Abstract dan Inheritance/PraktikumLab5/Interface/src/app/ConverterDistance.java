package app;

public class ConverterDistance extends Converter implements Distance{

    private final double inch = 0.0254;

    @Override
    public double metreToKilo(double mTK) {
        // TODO Auto-generated method stub
        double kiloConvert = mTK * 0.001;
        return kiloConvert;
        
    }

    @Override
    public double metreToMilli(double mTM) {
        double miliConvert = mTM * 1000;
        return miliConvert;
    }

    @Override
    public double inchToMetre(double iTM) {
        // TODO Auto-generated method stub
        double inchConvert = iTM * inch;
        return inchConvert;
    }

    @Override
    public void start() {
        System.out.println("Distance Converter is started");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Distance Converter is terminated");

    }

}