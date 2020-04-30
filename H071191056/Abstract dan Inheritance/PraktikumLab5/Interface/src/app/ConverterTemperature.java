package app;

public class ConverterTemperature extends Converter implements Temperature{

    @Override
    public double celciusToFahrenheit(double cTF) {
        // TODO Auto-generated method stub
        double fahrenheit = (((9 * cTF) / 5) + 32);
        return fahrenheit;
    }

    @Override
    public double celciusToKelvin(double cTK) {
        double kelvinToCelcius = cTK + 273.15;
        return kelvinToCelcius;
    }

    @Override
    public void start() {
        
        System.out.println("Temperature Converter is started");

    }

    @Override
    public void stop() {
        
        System.out.println("Temperature Converter is terminated");

    }

}