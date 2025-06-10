public class Main {
    public static void main(String[] args) {
        User john = new User("John");
        john.greet();

        User jane = new User("Jane");
        jane.greet();

        User anonym = new User();
        anonym.greet();

    }
}