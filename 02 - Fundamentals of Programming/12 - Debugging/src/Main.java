public class Main {
    public static void main(String[] args) {
        float width = 3.5f;
        float length = 5f;
        float height = 0.2f;
        float volume = width * length * height;
        //volume = volume * 1.1f;
        volume *= 1.1f;
        volume = Math.round(volume * 100) / 100f;
        System.out.println(volume);
    }
}