// Author: Magnus Rodrigues
// Roll No: 2628
package utilities;

import model.Student;
import java.io.*;

public class PersistenceDemo {

    public static void saveStudent(Student student) {

        try (ObjectOutputStream output
                = new ObjectOutputStream(
                        new FileOutputStream("output/student.ser"))) {

            output.writeObject(student);

            System.out.println("Student object saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving student: " + e.getMessage());
        }
    }

    public static void loadStudent() {

        try (ObjectInputStream input
                = new ObjectInputStream(
                        new FileInputStream("output/student.ser"))) {

            Student student = (Student) input.readObject();

            System.out.println("\n--- LOADED STUDENT ---");
            student.displayDetails();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading student: " + e.getMessage());
        }
    }
}
