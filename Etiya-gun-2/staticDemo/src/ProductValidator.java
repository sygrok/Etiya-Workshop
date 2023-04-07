public class ProductValidator {

    static {
        System.out.println("Static Yapıcı block");
    }

    public ProductValidator(){
        System.out.println("Yapıcı block");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void bisey(){

    }

//    public static class BaskaBirClass{
//        //inner class
//        public static void Sil(){
//
//        }
//    }

}
//yapıcı bloklar newlendiğinde çalışır
//ana class static olamaz