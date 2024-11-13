public class Main {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i += 2){
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
            System.out.println(i);
        }

//        int grade1 = 45;
//        int grade2 = 89;
//        int grade3 = 78;
//        int grade4 = 17;
//        int grade5 = 67;
//        int grade6 = 95;
//        int grade7 = 53;
//
//        float average = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7) / 7f;
//
//        System.out.println(average);

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