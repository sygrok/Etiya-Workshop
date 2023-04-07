public class Main {
        // Bir class sadece tek bir işi yapmalıdır.
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Lenovo Laptop", 3000, 4, "Gri");

//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Monster Notebook");
//        product.setPrice(20200);
//        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}