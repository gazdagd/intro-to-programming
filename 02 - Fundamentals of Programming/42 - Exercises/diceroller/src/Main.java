public class Main {
    public static void main(String[] args) {
        int sides = readSides();
        int result = generateNumber(sides);
        System.out.println("The result thrown with " + sides + " sided die is " + result);

    }

    private static int readSides() {
        // Endless loop that will be break with returning with a valid number
        while (true) {
            System.out.print("Enter how many sides the die has: ");
            String sidesInput = System.console().readLine();
            try {
                int sides = Integer.parseInt(sidesInput);
                if(sides <= 0) {
                    System.out.println("Please enter a number which is greater than 0!");
                    continue; // Continue the loop from the beginning
                }
                return sides; // Break the loop
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private static int generateNumber(int sides) {
        return (int) (Math.random() * sides + 1);
    }
}
