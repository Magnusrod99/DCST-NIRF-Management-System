package model;

public class Student extends Person {

    private String rollNumber;
    private String course;
    private int semester;

    public Student(String name, int age, String email,
            String department, String rollNumber,
            String course, int semester) {

        super(name, age, email, department, PersonType.STUDENT);

        this.rollNumber = rollNumber;
        this.course = course;
        this.semester = semester;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
    // Method Overloading

    public void displayStudentInfo(String message) {
        System.out.println(message);
        displayDetails();
    }
    // Method Overloading - No parameter

    public void displayStudentInfo() {
        System.out.println("Displaying student information:");
        displayDetails();
    }
}
