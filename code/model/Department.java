// Author: Magnus Rodrigues
// Roll No 2628;
package model;

public class Department {

    private String departmentName;
    private String location;

    public Department(String departmentName, String location) {
        this.departmentName = departmentName;
        this.location = location;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        System.out.println("Location: " + location);
    }
}
