import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void addStock() {
        Product product = new Product("laptop", 10, 1000, 20);
        product.updateStock(5);
        assertEquals(15, product.getStock());
    }

    @Test
    void subtractStockBelowZero() {
        Product product = new Product("laptop", 10, 1000, 20);
        product.updateStock(-15);
        assertEquals(10, product.getStock());
    }
}