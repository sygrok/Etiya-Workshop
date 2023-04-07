public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers =new BaseKrediManager[]
                {new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}

//bir class miras aldığı bir class'ı ezebilir.