import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    private double totalFeesPaid;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.totalFeesPaid = 0;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getTotalFeesPaid() {
        return totalFeesPaid;
    }

    public void payFees(double fees) {
        totalFeesPaid += fees;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nName: " + name + "\nTotal Fees Paid: Rs." + totalFeesPaid + "\n---------------";
    }
}