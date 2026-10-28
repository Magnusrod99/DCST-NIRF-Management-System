// Author: Magnus Rodrigues
// Roll No: 2628
package model;

import interfaces.DepartmentActivities;

public class ActivityCoordinator implements DepartmentActivities {

    @Override
    public void conductWorkshop() {
        System.out.println("Conducting a technical workshop at DCST.");
    }

    @Override
    public void conductCulturalEvent() {
        System.out.println("Organizing a cultural event at DCST.");
    }

    @Override
    public void displayDepartmentActivities() {
        System.out.println("DCST Department Activities:");
        conductWorkshop();
        conductCulturalEvent();
    }
}
