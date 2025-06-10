public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter your weight in kg: ");
        String weightInput = System.console().readLine();
        System.out.print("Please enter your height in cm: ");
        String heightInput = System.console().readLine();

        float weight = Float.parseFloat(weightInput);
        float height =  Float.parseFloat(heightInput) / 100;

        float bmi = weight / (height * height);

        System.out.println("Your Body Mass Index is " + bmi);

        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if(bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}