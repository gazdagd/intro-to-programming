public class Main {
    public static void main(String[] args) {
//        String name = "David";
//        System.out.println("Welcome " + name + "!");
//        name = "Kate";
//        System.out.println("Welcome " + name + "!");
        greet("David");
        greet("Kate");
    }
    static void greet(String name) {
        System.out.println("Welcome " + name + "!");
    }
}