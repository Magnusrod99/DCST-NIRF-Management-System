// Author: Magnus Rodrigues
// Roll No: 2628
package services;

import interfaces.Reportable;

public class ReportService {

    // Accepts any object implementing Reportable
    public void processReport(Reportable report) {

        System.out.println("\nProcessing Report...");

        report.generateReport();
    }
}
