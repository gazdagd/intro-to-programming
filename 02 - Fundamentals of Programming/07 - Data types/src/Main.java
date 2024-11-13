public class Main {
    public static void main(String[] args) {
        long distance = 45485748; // very big whole number
        byte age = 127; // -128 - 127
        double balance = 3467687.34; // big fractional number
        float pi = 3.14f; // double would be default, 'f' is needed
        boolean raining = false; // true/false
        char D = 68; // ASCII value 68 equals to uppercase D
        D = 'D'; // char is between single quotes
        String name = "David"; // String is with uppercase and is between double quotes

        System.out.println(distance);
        System.out.println(age);
        System.out.println(balance);
        System.out.println(pi);
        System.out.println(raining);
        System.out.println(D);
        System.out.println(name);

        // name = 5; Cannot reassign a value of a different type
        // width = 5     Python
    }
}