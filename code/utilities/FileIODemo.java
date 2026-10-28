// Author: Magnus Rodrigues
// Roll No: 2628
package utilities;

import java.io.*;
import java.util.Scanner;

public class FileIODemo {

    // Console Input and Output
    public static void consoleIO() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- CONSOLE INPUT/OUTPUT ---");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    // File Output
    public static void writeToFile(String data) {

        try (FileWriter writer = new FileWriter("output/student.txt")) {

            writer.write(data);

            System.out.println("Student data written to file successfully.");

        } catch (IOException e) {

            System.out.println("File writing error: " + e.getMessage());
        }
    }

    // File Input
    public static void readFromFile() {

        System.out.println("\n--- READING FROM FILE ---");

        try (BufferedReader reader
                = new BufferedReader(
                        new FileReader("output/student.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println("File reading error: " + e.getMessage());
        }
    }
}
