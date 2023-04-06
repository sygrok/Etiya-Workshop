// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 7;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi=true;
                break;
            }
        }

        if (varMi){
            mesajVer("Sayı mevcuttur :" + aranacak);
        }else{
            mesajVer("Sayı mevcut değildir :" + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}