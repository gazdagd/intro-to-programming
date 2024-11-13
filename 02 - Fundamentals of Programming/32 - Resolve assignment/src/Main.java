public class Main {
    public static void main(String[] args) {
        float[] temperatures = new float[10];

        int countOfDays = 0;
        while (countOfDays < temperatures.length) {
            System.out.print("Enter the temperature of day " + (countOfDays + 1) + ": ");
            String temp = System.console().readLine();
            if(temp.isBlank()) {
                break;
            } else {
                temperatures[countOfDays] = Float.parseFloat(temp);
                countOfDays++;
            }
        }

        //float[] temperatures = {23.4f, 22.2f, 23.6f, 25.1f, 24.8f, 21.9f, 22.5f};

        float sum = 0;
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;

        for(int i = 0; i < countOfDays; i++) {
            sum += temperatures[i];
            if(temperatures[i] < min) {
                min = temperatures[i];
            }
            if(temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        float average = sum / countOfDays;

        int countOfDaysAboveAverage = 0;
        for(int i = 0; i < countOfDays; i++) {
            if(temperatures[i] > average) {
                countOfDaysAboveAverage++;
            }
        }

        System.out.println("Average: " + average +
                "\nMin: " + min +
                "\nMax: " + max +
                "\nCount of days above the average: " + countOfDaysAboveAverage);
    }
}