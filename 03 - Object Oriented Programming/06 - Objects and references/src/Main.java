public class Main {
    public static void main(String[] args) {
        User john = new User("John");
        User stillJohn = john;
        john.name = "JOHN";
        stillJohn.greet();
    }
}