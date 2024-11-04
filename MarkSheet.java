import java.util.Scanner;

public class MarkSheet {
    private String studentName;
    private int totalMarks;
    private int obtainedMarks;

    public MarkSheet(String studentName, int totalMarks, int obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public double calculatePercentage() {
        return ((double) obtainedMarks / totalMarks) * 100;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public double calculateGPA() {
        switch (calculateGrade()) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void displayMarkSheet() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
        System.out.println("GPA: " + calculateGPA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        
        System.out.print("Enter total marks: ");
        int totalMarks = input.nextInt();
        
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = input.nextInt();
        
        MarkSheet student = new MarkSheet(name, totalMarks, obtainedMarks);
        student.displayMarkSheet();
    }
}