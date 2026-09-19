public class BMICalculator {
    public static void main(String[] args) {
        int numPeople = 10;
        double[] heights = new double[numPeople];
        double[] weights = new double[numPeople];
        for (int i = 0; i < numPeople; i++) {
            heights[i] = 1.5 + Math.random() * 0.5; 
            weights[i] = 50 + Math.random() * 50;   
        }
        printWellnessReport(heights, weights);
    }
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("Person %d - Height: %.2f m, Weight: %.2f kg \t BMI: %.2f | Status: %s%n",
                    (i + 1), heights[i], weights[i], bmi, status);
        }
    }
}