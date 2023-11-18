import java.util.ArrayList;

class FeesManagementSystem {
    private ArrayList<Student> students;

    public FeesManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void recordFeePayment(String studentId, double fees) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.payFees(fees);
            System.out.println("Payment recorded successfully for student ID: " + studentId);
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
