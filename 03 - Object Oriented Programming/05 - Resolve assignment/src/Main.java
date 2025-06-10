public class Main {
    public static void main(String[] args) {
        User u1 = new User("john@mail.com");
        Account a1 = new Account("a1", u1);
        a1.addMoney(5000);
        a1.printData();
        a1.withdrawMoney(6000);
        a1.printData();
        a1.addMoney(11000);
        a1.printData();
        a1.withdrawMoney(1000);
        a1.printData();
        Account a2 = new Account("a2", u1);
        a2.addMoney(5000);
        a2.printData();
    }
}