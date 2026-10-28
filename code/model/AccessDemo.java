// Author: Magnus Rodrigues
// Roll No: 2628
package model;

public class AccessDemo {

    public String departmentName = "DCST";

    private String confidentialData = "NIRF Internal Records";

    protected String staffSection = "Teaching Staff";

    public void displayInsideClass() {

        System.out.println("\n--- ACCESS INSIDE CLASS ---");

        System.out.println("Public: " + departmentName);

        System.out.println("Private: " + confidentialData);

        System.out.println("Protected: " + staffSection);
    }
}
