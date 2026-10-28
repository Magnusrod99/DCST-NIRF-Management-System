// Author: Magnus Rodrigues
// Roll No: 2628
package external;

import model.AccessDemo;

public class ExternalAccessTest extends AccessDemo {

    public void displayProtectedData() {

        System.out.println("\n--- PROTECTED ACCESS THROUGH INHERITANCE ---");

        System.out.println("Protected: " + staffSection);

        System.out.println("Public: " + departmentName);
    }

    public static void main(String[] args) {

        ExternalAccessTest test = new ExternalAccessTest();

        test.displayProtectedData();
    }
}
