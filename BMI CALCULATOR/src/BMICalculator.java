import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt the user to enter height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Interpret BMI and display the result
        String interpretation = interpretBMI(bmi);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation: " + interpretation);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate BMI
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to interpret BMI
    private static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
