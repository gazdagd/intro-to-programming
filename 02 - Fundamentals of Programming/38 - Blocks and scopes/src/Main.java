public class Main {
    public static void main(String[] args) {
        int[] cart = {10, 20};
        int total = getTotal(cart);
        System.out.println(total);
    }

    static int getTotal(int[] cart) {
        int total = 0;
        for(int i = 0; i < cart.length; i++) {
            //int total = 0;
            int var = 0;
            total += cart[i];
        }
        int var  = 121;
        return total;
    }

}