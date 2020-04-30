package app;

public class ConverterData extends Converter implements Data{


    @Override
    public long teraToGiga(long teraTG) {
        // TODO Auto-generated method stub
        double tera = Math.pow(1024, 1);
        long gigaByteConvert = teraTG * (long) tera;
        return gigaByteConvert;
    }

    @Override
    public long teraToMega(long teraTM) {
        // TODO Auto-generated metho

        //Menggunakan Math.pow
        double tera = Math.pow(1024, 2);
        long megaByteConvert = teraTM * (long)tera;
        return megaByteConvert;
    }

    @Override
    public long teraToKilo(long teraTK) {
        // TODO Auto-generated method stub
        //Menggunakan Math.pow
        double tera = Math.pow(1024, 3);
        long kiloByteConvert = teraTK * (long) tera;
        /* Mengalikan dengan bilangan 1024 pangkat 3
        long kiloByteConvert = teraTK * 1073741824;*/
        return kiloByteConvert;
    }

    @Override
    public void start() {
        
        System.out.println("Data Converter is Started");

    }

    @Override
    public void stop() {
        System.out.println("Data Converter is Terminated");

    }

}