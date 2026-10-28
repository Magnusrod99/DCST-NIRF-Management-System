// Author: Magnus Rodrigues
// Roll No: 2628
package utilities;

import model.Person;
import model.Student;
import model.Staff;

public class RTTIDemo {

    public static void displayRuntimeType(Person person) {

        System.out.println("\n--- RTTI DEMONSTRATION ---");

        // Identify actual runtime class
        System.out.println(
                "Actual Runtime Class: " + person.getClass().getName()
        );

        // Check object type
        if (person instanceof Student) {

            System.out.println("This object belongs to the Student class.");

        } else if (person instanceof Staff) {

            System.out.println("This object belongs to the Staff class.");

        }

        // Check inheritance
        if (person instanceof Person) {

            System.out.println("This object is also a Person.");
        }
    }
}
