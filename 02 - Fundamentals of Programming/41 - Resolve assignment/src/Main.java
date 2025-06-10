public class Main {
    public static void main(String[] args) {
        float[] sales = new float[100];
        int size = readData(sales);
        calculateAndPrint(sales, size);
    }

    static int readData(float[] sales) {
        int size = 0;

        while(size < sales.length) {
            System.out.print("Enter sales figure for day " + (size + 1) + ": ");
            String input = System.console().readLine();
            if(input.isBlank()) {
                break;
            } else {
                try{
                    sales[size] = Float.parseFloat(input);
                    size++;
                } catch(NumberFormatException e) {
                    System.out.println("Please enter a valid number!");
                }
            }
        }
        return size;
    }

    static void calculateAndPrint(float[] sales, int size) {
        float total = 0;
        int highestIndex = 0;
        int lowestIndex = 0;

        for(int i = 0; i < size; i++) {
            total += sales[i];
            if(sales[highestIndex] < sales[i]){
                highestIndex = i;
            }
            if(sales[lowestIndex] > sales[i]) {
                lowestIndex = i;
            }
        }

        float average = total / size;

       print(total, average, highestIndex, lowestIndex, sales, size);
    }

    static void print(float total, float average, int highestIndex, int lowestIndex, float[] sales, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(sales[i] + ", ");
        }
        System.out.println("\nTotal sales amount is " + total +
                "\nThe average sales amount is " + average +
                "\ntThe highest day is " + (highestIndex + 1) + ", value: " + sales[highestIndex] +
                "\nLowest day is " + (lowestIndex + 1) + ", value: " + sales[lowestIndex]);
    }
}