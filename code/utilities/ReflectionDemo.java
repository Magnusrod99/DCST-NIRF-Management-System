// Author: Magnus Rodrigues
// Roll No: 2628
package utilities;

import model.Student;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void displayClassInformation() {

        Class<?> studentClass = Student.class;

        System.out.println("\n--- REFLECTION ---");

        System.out.println("Class Name: " + studentClass.getName());

        System.out.println("\nStudent Class Fields:");

        Field[] fields = studentClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("\nStudent Class Methods:");

        Method[] methods = studentClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
