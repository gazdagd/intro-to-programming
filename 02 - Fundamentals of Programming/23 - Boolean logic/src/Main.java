public class Main {
    public static void main(String[] args) {
        // AND
        int score = 8;
        boolean isBetween = score > 7 && score < 9;

        System.out.println(isBetween); // true

        // OR
        boolean vanilla = true;
        boolean chocolate = true;
        System.out.println(vanilla || chocolate);
        // NOT
        System.out.println(!isBetween);

        // Example
        boolean a = true;
        boolean b = false;

        System.out.println((a || b) && !a); // false
    }
}