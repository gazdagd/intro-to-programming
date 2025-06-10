public class Main {
    public static void main(String[] args) {
        User john = new User("John");
        User jane = null;
        Integer num = 5; // autoboxing
        //Integer num2 = new Integer(5);
		System.out.println(john.age);
        System.out.println(john.password); // null
        System.out.println(jane.password); // NullPointerException
    }
}