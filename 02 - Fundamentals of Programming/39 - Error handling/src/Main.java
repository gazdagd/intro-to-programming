public class Main {
    public static void main(String[] args) {
        String input = System.console().readLine();
        int num = 0;
        try{
            num = Integer.parseInt(input);
            System.out.println(num); // Does not execute in case of an exception
        } catch(NumberFormatException numberFormatException) {
            System.out.println("Please enter an integer!"); // Executed only if there was an exception
        }
        System.out.println(num); // Executed regardless of exception (prints 0)
    }
}