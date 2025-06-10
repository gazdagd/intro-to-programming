public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public boolean isSquare() {
        return a == b;
    }

    /**
     * Gets the area of this rectangle.
     * @return The area of this rectangle.
     */
    public int getArea() {
        return a * b;
    }
}