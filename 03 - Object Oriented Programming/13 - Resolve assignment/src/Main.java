import product.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Keyboard", 50 , 70, 60);
        Product product2 = new Product("Mouse", 22, 30, 30);
        product1.printDetails();
        product2.printDetails();

        product1.updateStock(-10);
        product1.printDetails();
        product2.updateStock(-23);

        product1.setPrice(80);
        System.out.println("Discounted price: " + Product.calculateDiscountedPrice(product1));

        product2.updateStock(10);
    }
}