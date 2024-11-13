public class Main {
    public static void main(String[] args) {
        String height = "170";
        int heightInCentiMeters = Integer.parseInt(height);
        float heightInMeters = (float) heightInCentiMeters / (float) 100.;

        System.out.println(height);
        System.out.println(heightInMeters);
    }
}
