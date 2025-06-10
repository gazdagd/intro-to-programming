public class User {

    String name;
    int age;
    String password;

    User() {
        this("Anonymous");
    }

    User(String name) {
        this.name = name;
        System.out.println("Object created!");
    }

    void greet() {
        System.out.println("Hello " + name + '!');
    }

}
