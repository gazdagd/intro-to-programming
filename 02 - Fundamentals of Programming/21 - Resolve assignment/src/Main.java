public class Main {
    public static void main(String[] args) {
        System.out.print("Width: ");
        String widthInput = System.console().readLine();
        System.out.print("Length: ");
        String lengthInput = System.console().readLine();
        System.out.print("Height: ");
        String heightInput = System.console().readLine();

        float width = Float.parseFloat(widthInput);
        float length = Float.parseFloat(lengthInput);;
        float height = Float.parseFloat(heightInput);;
        float volume = width * length * height;
        volume *= 1.1f;

        volume = Math.round(volume * 100.0f) / 100.0f;
        System.out.println("Ordered volume is " + volume + " m3.\n" +
                "\tWidth: " + width + " m\n" +
                "\tLength: " + length + " m\n" +
                "\tHeigth: " + height + " m");
    }
}