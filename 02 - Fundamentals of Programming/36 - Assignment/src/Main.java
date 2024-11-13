public class Main {
    public static void main(String[] args) {
        int [] cart = new int[10];
        float tax = 0.27f;

        cart[0] = 10;
        int total = 0;
        for(int i = 0; i < cart.length; i++) {
            total += cart[i];
        }
        float totalGross = total + (total * tax);
        System.out.println("Total net amount: " + total + ", total gross amount: " + totalGross);

        cart[1] = 20;
        total = 0;
        for(int i = 0; i < cart.length; i++) {
            total += cart[i];
        }
        totalGross = total + (total * tax);
        System.out.println("Total net amount: " + total + ", total gross amount: " + totalGross);
    }
}