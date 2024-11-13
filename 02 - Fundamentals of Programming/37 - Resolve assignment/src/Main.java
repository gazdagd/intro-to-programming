public class Main {
    public static void main(String[] args) {
        int [] cart = new int[10];
        float tax = Float.parseFloat(args[0]);

        cart[0] = 10;
        itemAdded(cart, tax);

        cart[1] = 20;
        itemAdded(cart, tax);
    }

    static void itemAdded(int[] cart, float tax) {
        int total = calcTotal(cart);
        float totalGross = calcGrossTotal(total, tax);
        System.out.println("Total net amount: " + total + ", total gross amount: " + totalGross);
    }

    static int calcTotal(int[] cart) {
        int total = 0;
        for(int i = 0; i < cart.length; i++) {
            total += cart[i];
        }
        return total;
    }

    static float calcGrossTotal(int total, float tax) {
        return total + (total * tax);
    }
}