package product;

public class Product {

    private static final float DISCOUNT_PERCENTAGE = 10;

    private String name;
    private int stock;
    private float price;
    private int maxStock;

    public Product(String name, int stock, float price, int maxStock) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.maxStock = maxStock;
    }

    public void updateStock(int amount){
        int newStock = stock + amount;
        if(newStock >= 0 && newStock <= maxStock) {
            stock = newStock;
        } else {
            System.out.println("Invalid stock amount!");
        }
    }

    public void setPrice(float price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name +
                "\tstock: " + stock + "/" + maxStock +
                "\tprice: " + price);
    }

    public static float calculateDiscountedPrice(Product product) {
        return product.price * (1 - DISCOUNT_PERCENTAGE / 100);
    }
}
