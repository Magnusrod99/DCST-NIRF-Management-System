package model;

import java.io.Serializable;

public abstract class Person implements Serializable {

    // Enum for person category
    public enum PersonType {
        STUDENT,
        TEACHING_STAFF,
        NON_TEACHING_STAFF
    }

    // Static counter shared by all Person objects
    private static int memberCount = 0;

    // Attributes with different access modifiers
    private String name;
    private int age;
    protected String email;
    public String department;

    private PersonType personType;

    // Constructor
    public Person(String name, int age, String email,
            String department, PersonType personType) {

        this.name = name;
        this.age = age;
        this.email = email;
        this.department = department;
        this.personType = personType;

        memberCount++;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public PersonType getPersonType() {
        return personType;
    }

    // Static method
    public static void displayMemberCount() {
        System.out.println("Total Members Created: " + memberCount);
    }

    // Abstract method
    public abstract void displayDetails();
}
