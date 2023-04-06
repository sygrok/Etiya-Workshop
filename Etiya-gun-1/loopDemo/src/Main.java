public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        //While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");

        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j+=3;
        }while (j < 10);
        System.out.println("do-while döngüsü bitti");

    }
}
//infinite loop