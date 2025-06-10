public class User {

    String name;

    User() {
//        this.name = "Anonymous";
//        System.out.println("Construct default object");
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
