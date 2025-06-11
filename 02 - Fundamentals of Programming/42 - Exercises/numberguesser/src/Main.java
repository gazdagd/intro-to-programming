import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(101);
        int numberOfGuesses = 0;
        boolean notFound = true;
        System.out.println("I think of a number from 1 to 100. Find it!");
        // game loop
        while (notFound) { // endless loop could be used as well
            System.out.print("Your guess: ");
            int guess = readNumber();
            numberOfGuesses++;
            if(numberToGuess < guess) {
                System.out.println("It is less than " + guess);
            } else if(numberToGuess > guess) {
                System.out.println("It is greater than " + guess);
            } else {
                notFound = false; // break the loop
            }
        }
        System.out.println("Congrats! You found it in " + numberOfGuesses + " guesses!");
    }
    private static int readNumber() {
        // Endless loop that will be break with returning with a valid number
        while (true) {
            String input = System.console().readLine();
            try {
                int num = Integer.parseInt(input);
                if(num <= 0 || num > 100) {
                    System.out.println("Please enter a number which is greater than 0 but less than 100!");
                    continue; // Continue the loop from the beginning
                }
                return num; // Break the loop
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
}