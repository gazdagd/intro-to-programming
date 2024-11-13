public class Main {
    public static void main(String[] args) {
        int score = 8;

        //System.out.println(score > 7); // true
        boolean greater = score > 7;
        boolean greaterOrEqual = score >= 7;
        boolean lesser = score < 7;
        boolean lesserOrEqual = score <= 7;
        boolean equal = score == 7;
        boolean notEqual = score != 7;

        System.out.println(greater); // true
        System.out.println(greaterOrEqual); // true
        System.out.println(lesser); // false
        System.out.println(lesserOrEqual); // false
        System.out.println(equal); // false
        System.out.println(notEqual); // true
    }
}