public class Main {
    public static void main(String[] args) {
        float width = 3.5f;
        float length = 5f;
        float heigth = 0.2f;
        float volume = width * length * heigth;
        volume *= 1.1f;

        volume = Math.round(volume * 100.0f) / 100.0f;
        System.out.println(volume);
    }
}