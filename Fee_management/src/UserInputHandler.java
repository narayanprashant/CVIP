import java.util.Scanner;

class UserInputHandler {
    private Scanner scanner;
    private FeesManagementSystem feesManagementSystem;

    public UserInputHandler() {
        this.scanner = new Scanner(System.in);
        this.feesManagementSystem = new FeesManagementSystem();
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Student\n2. Record Fee Payment\n3. Display Student Details\n4. Exit");
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    recordFeePayment();
                    break;
                case 3:
                    feesManagementSystem.displayStudentDetails();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent() {
        String studentId = getStringInput("Enter student ID: ");
        String name = getStringInput("Enter student name: ");
        Student student = new Student(studentId, name);
        feesManagementSystem.addStudent(student);
        System.out.println("Student added successfully!");
    }

    private void recordFeePayment() {
        String studentId = getStringInput("Enter student ID: ");
        double fees = getDoubleInput("Enter fee amount: ");
        feesManagementSystem.recordFeePayment(studentId, fees);
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid double: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}