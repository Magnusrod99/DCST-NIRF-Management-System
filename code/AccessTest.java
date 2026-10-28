// Author: Magnus Rodrigues
// Roll No: 2628

import model.AccessDemo;

public class AccessTest {

    public static void main(String[] args) {

        AccessDemo demo = new AccessDemo();

        System.out.println("--- ACCESS OUTSIDE CLASS ---");

        // Public access
        System.out.println("Public: " + demo.departmentName);

        // Protected access is not allowed here
        // System.out.println(demo.staffSection);
        // Private access is not allowed here
        // System.out.println(demo.confidentialData);
    }
}
