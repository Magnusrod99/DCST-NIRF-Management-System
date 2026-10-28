// Author: Magnus Rodrigues
// Roll No: 2628
package services;

import exceptions.InvalidStudentAgeException;

public class StudentRegistrationService {

    public void registerStudent(String name, int age)
            throws InvalidStudentAgeException {

        if (age < 18) {
            throw new InvalidStudentAgeException(
                    "Student age must be 18 or above!"
            );
        }

        System.out.println(
                "Student " + name + " registered successfully."
        );
    }
}
