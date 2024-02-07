package Task5;




import java.util.ArrayList;

import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
public class StudentManagementUI {
	private static Scanner sc = new Scanner(System.in);
    private static StudentManagementSystem sms = new StudentManagementSystem();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nStudent Management System");
            System.out.println("1- Add Student");
            System.out.println("2- Remove Student");
            System.out.println("3- Search Student");
            System.out.println("4- Display All Students");
            System.out.println("5- Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Wrong Choice. Please enter a number between 1 and 5.");
            }
        }
        sc.close();
    }

    private static void addStudent() {
        System.out.println("\nAdding Student");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter student grade: ");
        String grade = sc.nextLine();

        Student student = new Student(name, rollNumber, grade);
        sms.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent() {
        System.out.println("\nRemoving Student");
        System.out.print("Enter student roll number to remove: ");
        int rollNumber = sc.nextInt();
        if (sms.searchStudent(rollNumber) != null) {
            sms.removeStudent(rollNumber);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    private static void searchStudent() {
        System.out.println("\nSearching Student");
        System.out.print("Enter student roll number to search: ");
        int rollNumber = sc.nextInt();
        Student student = sms.searchStudent(rollNumber);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    private static void displayAllStudents() {
        System.out.println("\nAll Students");
        sms.displayAllStudents();
    }
}

