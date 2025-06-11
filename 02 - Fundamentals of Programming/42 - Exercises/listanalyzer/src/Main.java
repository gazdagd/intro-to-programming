public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int largest = Integer.MIN_VALUE; // The smallest number possible
        int sum = 0; // Sum needed for average calculation
        for(int i = 0; i < nums.length; i++) {
            int num = readNumber(i + 1);
            if(num > largest) {
                largest = num;
            }
            sum += num;
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Average: " + (sum / 5.));
    }

    private static int readNumber(int i) {
        // Endless loop that will be break with returning with a valid number
        while (true) {
            System.out.print("Enter number " + i + ": ");
            String input = System.console().readLine();
            try {
                return Integer.parseInt(input); // Break the loop
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

}