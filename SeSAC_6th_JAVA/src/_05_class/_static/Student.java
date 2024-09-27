package _05_class._static;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String student_ID;
    private int grade;
    private static int totalStudents = 0;

    public Student(String name, String student_ID, int grade) {
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public int getGrade() {
        return grade;
    }

    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + student_ID);
        System.out.println("학년: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n학생 정보를 입력하세요.");

            System.out.print("이름 (종료를 원하면 '종료' 입력): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("종료")) {
                break;
            }

            System.out.print("학번 (종료를 원하면 '0' 입력): ");
            String student_ID = scanner.nextLine();
            if (student_ID.equals("0")) {
                break;
            }

            System.out.print("학년: ");
            int grade = scanner.nextInt();
            scanner.nextLine();

            students.add(new Student(name, student_ID, grade));
        }

        System.out.println("\n입력된 학생 정보:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("---------------------");
        }

        System.out.println("전체 학생 수: " + Student.getTotalStudents());

        scanner.close();
    }
}
