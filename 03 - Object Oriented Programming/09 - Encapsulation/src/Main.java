import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("John");
        System.out.println(user.getName());
        user.setName("Jane");
        System.out.println(user.getName());
    }
}