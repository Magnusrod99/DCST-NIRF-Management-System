package model;

public class Staff extends Person {

    private String staffId;
    private String designation;

    public Staff(String name, int age, String email,
            String department, String staffId,
            String designation, PersonType type) {

        super(name, age, email, department, type);

        this.staffId = staffId;
        this.designation = designation;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n--- STAFF DETAILS ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Designation: " + designation);
    }
}
