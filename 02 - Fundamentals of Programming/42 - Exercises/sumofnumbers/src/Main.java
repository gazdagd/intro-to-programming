public class Main {
    public static void main(String[] args) {
        int N = readPositiveNumber();
        int sum = getSum(N);
        System.out.println("The sum of numbers from 1 to " + N +" is " + sum + ".");
    }

    private static int getSum(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    private static int readPositiveNumber() {
        // Endless loop that will be break with returning with a valid number
        while (true) {
            System.out.print("Enter a positive number: ");
            String input = System.console().readLine();
            try {
                int num = Integer.parseInt(input);
                if(num <= 0) {
                    System.out.println("Please enter a number which is greater than 0!");
                    continue; // Continue the loop from the beginning
                }
                return num; // Break the loop
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

}