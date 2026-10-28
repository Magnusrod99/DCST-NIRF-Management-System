// Author: Magnus Rodrigues
// Roll No: 2628
package model;

import interfaces.Reportable;

public class StudentReport implements Reportable {

    @Override
    public void generateReport() {

        System.out.println("\n--- STUDENT REPORT ---");

        System.out.println("Department: DCST");

        System.out.println("Program: MCA");

        System.out.println("Report: Student academic performance summary generated.");
    }
}
