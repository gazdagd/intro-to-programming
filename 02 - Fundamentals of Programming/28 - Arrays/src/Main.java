public class Main {
    public static void main(String[] args) {
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

        grades[0] = 33;
        //grades[7] = 12;
        grades = new int[]{45, 89, 78, 17, 67, 95, 53, 23};

        System.out.println(grades[0]);
		System.out.println(grades.length);
        System.out.println(grades[grades.length - 1]);

        int[] empty = new int[10];
        System.out.println(empty[5]);
    }
}