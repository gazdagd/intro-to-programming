import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testIsSquare_True() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertTrue(rectangle.isSquare());
    }

    @Test
    public void testIsSquare_False() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertFalse(rectangle.isSquare());
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea());
    }

    @Test
    public void testGetArea_Square() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertEquals(25, rectangle.getArea());
    }

    @Test
    public void testGetArea_ZeroArea() {
        Rectangle rectangle = new Rectangle(0, 5);
        assertEquals(0, rectangle.getArea());
    }
}