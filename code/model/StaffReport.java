// Author: Magnus Rodrigues
// Roll No: 2628
package model;

import interfaces.Reportable;

public class StaffReport implements Reportable {

    @Override
    public void generateReport() {

        System.out.println("\n--- STAFF REPORT ---");

        System.out.println("Department: DCST");

        System.out.println("Staff Category: Teaching and Non-Teaching");

        System.out.println("Report: Staff information summary generated.");
    }
}
