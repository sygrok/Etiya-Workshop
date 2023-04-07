public class Main {
    public static void main(String[] args) {
//        ICustomerDal customerDal = new OracleCustomerDal();
//        customerDal.Add();

        CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());
        customerManager.Add();
    }
}

//