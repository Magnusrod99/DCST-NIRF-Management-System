// Author: Magnus Rodrigues
// Roll No: 2628
package model;

public class StudentClone implements Cloneable {

    private String name;
    private Address address;

    public StudentClone(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("City: " + address.getCity());
    }

    // Shallow copy
    public StudentClone shallowClone() {
        try {
            return (StudentClone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    // Deep copy
    public StudentClone deepClone() {
        StudentClone copy = shallowClone();
        copy.address = address.clone();
        return copy;
    }
}
