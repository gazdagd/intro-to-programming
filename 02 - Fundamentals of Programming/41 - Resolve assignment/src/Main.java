public class Main {
    public static void main(String[] args) {
        float[] sales = new float[100];
        int size = readData(sales);
        printData(sales, size);
        calculateAndPrint(sales, size);
    }

    static int readData(float[] sales) {
        int size = 0;

        while (size < sales.length) {
            System.out.print("Enter sales figure for day " + (size + 1) + ": ");
            String input = System.console().readLine();
            if(input.isBlank()) {
                break;
            } else {
                try {
                    sales[size] = Float.parseFloat(input);
                    size++;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number!");
                }
            }
        }
        return size;
    }

    static void printData(float sales[], int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(sales[i] + ",");
        }
    }

    static void calculateAndPrint(float[] sales, int size) {
        float total = 0;
        float highestValue = sales[0];
        int highestIndex = 0;
        float lowestValue = sales[0];
        int lowestIndex = 0;

        for(int i = 0; i < size; i++) {
            total += sales[i];
            if(highestValue < sales[i]) {
                highestValue = sales[i];
                highestIndex = i;
            }
            if(lowestValue > sales[i]) {
                lowestValue = sales[i];
                lowestIndex = i;
            }
        }
        float average = total / size;

        print(total, average, highestIndex, highestValue, lowestIndex, lowestValue);
    }

    static void print(float total, float average, int highestIndex, float highestValue, int lowestIndex, float lowestValue) {
        System.out.println("\nTotal sales amount: " + total +
                "\nAverage sales amount: " + average +
                "\nHighest day: " + (highestIndex + 1) + ", value: " + highestValue +
                "\nLowest day: " + (lowestIndex + 1) + ", value: " + lowestValue);
    }
}