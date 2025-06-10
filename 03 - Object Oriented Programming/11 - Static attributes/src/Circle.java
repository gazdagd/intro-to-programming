public class Circle {

    public static final float PI = 3.14f;

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return radius * radius * PI;
    }
}
