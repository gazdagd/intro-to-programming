public class Main {
    public static void main(String[] args) {
        int sum = sum(3, 5);
        System.out.println(sum);
        float sumFloat = sum(3.5f, 2.3f);
        System.out.println(sumFloat);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }
}