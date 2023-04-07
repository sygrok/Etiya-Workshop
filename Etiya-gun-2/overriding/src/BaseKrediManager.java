public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
    }
}

//    public final double hesapla(double tutar){ //final kullandığında override edilmesini engeller.
//        return tutar * 1.18;
//    }