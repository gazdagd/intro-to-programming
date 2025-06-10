public class Main {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i += 2){
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
            System.out.println(i);
        }

        int[] grades = {45, 89, 78, 17, 67, 95, 53};

        // initialize sum
        int sum = 0;
        // loop through the array
        for(int i = 0; i < grades.length; i++) {
            // get the element of the array at index and add it to sum
            sum += grades[i];
        }
        // divide sum with the length of the array
        float average = (float) sum / grades.length;
        System.out.println(average);

    }
}