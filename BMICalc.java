public class BMICalc {
    public static void main(String[] args) {
        double weight = 55, height = 1.6;
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
