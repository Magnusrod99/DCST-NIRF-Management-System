// Author: Magnus Rodrigues
// Roll No: 2628
package model;

import interfaces.AcademicParticipant;
import interfaces.CulturalParticipant;

public class StudentActivities implements AcademicParticipant, CulturalParticipant {

    public void displayActivities() {
        participateInAcademicActivity();
        participateInCulturalActivity();
    }
}
