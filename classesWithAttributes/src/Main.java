public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop", 3500,34);

//        product.setName("HP Laptop");
//        product.setId(1);
//        product.setStockAmount(3);
//        product.setDescription("Harika hızlı");
//        product.setPrice(27000);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}