
// Author: Magnus Rodrigues
// Roll No: 2628
import exceptions.InvalidStudentAgeException;
import java.util.*;
import model.AccessDemo;
import model.ActivityCoordinator;
import model.Address;
import model.Department;
import model.GenericBox;
import model.Person;
import model.Staff;
import model.StaffReport;
import model.Student;
import model.StudentActivities;
import model.StudentClone;
import model.StudentReport;
import services.ReportService;
import services.StudentRegistrationService;
import utilities.FileIODemo;
import utilities.PersistenceDemo;
import utilities.RTTIDemo;
import utilities.ReflectionDemo;

public class Main {

    public static void main(String[] args) {

        // =====================================
        // 1. OBJECTS, CONSTRUCTORS AND REFERENCES
        // =====================================
        System.out.println("\n--- OBJECTS AND CONSTRUCTORS ---");

        Student s1 = new Student(
                "Rahul", 21, "rahul@gmail.com",
                "DCST", "2628", "MCA", 1
        );

        Staff t1 = new Staff(
                "Amit", 35, "amit@gmail.com",
                "DCST", "ST101", "Assistant Professor",
                Person.PersonType.TEACHING_STAFF
        );

        s1.displayDetails();
        t1.displayDetails();

        // Object referencing
        System.out.println("\n--- OBJECT REFERENCING ---");

        Department d1 = new Department(
                "Computer Science and Technology",
                "Goa University"
        );

        Department d2 = d1;

        System.out.println(
                "Are d1 and d2 the same object? " + (d1 == d2)
        );

        d1.displayDepartment();

        d2.setDepartmentName("CST Department - Updated");

        System.out.println("After updating through d2:");
        d1.displayDepartment();

        // Static method
        System.out.println("\n--- STATIC MEMBER COUNT ---");
        Person.displayMemberCount();

        // =====================================
        // 2. MULTIPLE INTERFACE IMPLEMENTATION
        // =====================================
        System.out.println("\n--- MULTIPLE INTERFACE IMPLEMENTATION ---");

        StudentActivities studentActivities = new StudentActivities();
        studentActivities.displayActivities();

        // =====================================
        // 3. MULTIPLE INTERFACE INHERITANCE
        // =====================================
        System.out.println("\n--- MULTIPLE INTERFACE INHERITANCE ---");

        ActivityCoordinator coordinator = new ActivityCoordinator();
        coordinator.displayDepartmentActivities();

        // =====================================
        // 4. ACCESS MODIFIERS
        // =====================================
        System.out.println("\n--- ACCESS MODIFIERS ---");

        AccessDemo accessDemo = new AccessDemo();
        accessDemo.displayInsideClass();

        System.out.println("Public department: " + accessDemo.departmentName);

        // =====================================
        // 5. ABSTRACT CLASS AND INTERFACE
        // =====================================
        System.out.println("\n--- ABSTRACT CLASS AND INTERFACE ---");

        StudentReport studentReport = new StudentReport();
        StaffReport staffReport = new StaffReport();

        studentReport.generateReport();
        staffReport.generateReport();

        // =====================================
        // 6. CLASS AS TYPE AND MESSAGE PASSING
        // =====================================
        System.out.println("\n--- CLASS AS TYPE AND MESSAGE PASSING ---");

        ReportService service = new ReportService();

        service.processReport(studentReport);
        service.processReport(staffReport);

        // =====================================
        // 7. POLYMORPHISM
        // =====================================
        System.out.println("\n--- METHOD OVERRIDING ---");

        Person person1 = s1;
        Person person2 = t1;

        person1.displayDetails();
        person2.displayDetails();

        System.out.println("\n--- METHOD OVERLOADING ---");

        s1.displayStudentInfo(
                "Student information using overloaded method:"
        );

        s1.displayStudentInfo();

        // =====================================
        // 8. GENERICS AND COLLECTIONS
        // =====================================
        System.out.println("\n--- GENERIC CLASS ---");

        GenericBox<String> studentName
                = new GenericBox<>("Rahul");

        GenericBox<Integer> studentRollNumber
                = new GenericBox<>(2628);

        studentName.displayValue();
        studentRollNumber.displayValue();

        // List
        System.out.println("\n--- LIST COLLECTION ---");

        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Sneha");

        System.out.println("Student List: " + students);

        // Queue
        System.out.println("\n--- QUEUE COLLECTION ---");

        Queue<String> registrationQueue = new LinkedList<>();

        registrationQueue.add("Rahul");
        registrationQueue.add("Amit");
        registrationQueue.add("Sneha");

        System.out.println("Registration Queue: " + registrationQueue);
        System.out.println("Next Student: " + registrationQueue.poll());
        System.out.println("Remaining Queue: " + registrationQueue);

        // Set
        System.out.println("\n--- SET COLLECTION ---");

        Set<String> courses = new HashSet<>();

        courses.add("MCA");
        courses.add("BCA");
        courses.add("MCA");

        System.out.println("Unique Courses: " + courses);

        // Map
        System.out.println("\n--- MAP COLLECTION ---");

        Map<String, String> studentRecords = new HashMap<>();

        studentRecords.put("2628", "Rahul");
        studentRecords.put("2629", "Amit");
        studentRecords.put("2630", "Sneha");

        System.out.println("Student Records: " + studentRecords);

        System.out.println(
                "Student with Roll Number 2628: "
                + studentRecords.get("2628")
        );

        // =====================================
        // 9. EXCEPTION HANDLING
        // =====================================
        System.out.println("\n--- EXCEPTION HANDLING ---");

        StudentRegistrationService registrationService
                = new StudentRegistrationService();

        try {
            registrationService.registerStudent("Rahul", 21);
            registrationService.registerStudent("Amit", 16);

        } catch (InvalidStudentAgeException e) {

            System.out.println("Registration Error: " + e.getMessage());

        } finally {

            System.out.println("Student registration process completed.");
        }

        // =====================================
        // 10. REFLECTION
        // =====================================
        ReflectionDemo.displayClassInformation();

        // =====================================
        // 11. OBJECT PERSISTENCE
        // =====================================
        System.out.println("\n--- OBJECT PERSISTENCE ---");

        PersistenceDemo.saveStudent(s1);
        PersistenceDemo.loadStudent();

        // =====================================
        // 12. CONSOLE I/O AND FILE I/O
        // =====================================
        System.out.println("\n--- FILE I/O ---");

        String studentData = "Student Name: " + s1.getName()
                + "\nRoll Number: 2628"
                + "\nCourse: MCA";

        FileIODemo.writeToFile(studentData);
        FileIODemo.readFromFile();
        FileIODemo.consoleIO();

        // =====================================
        // 13. SHALLOW AND DEEP CLONING
        // =====================================
        System.out.println("\n--- SHALLOW AND DEEP CLONING ---");

        Address originalAddress = new Address("Goa");

        StudentClone originalStudent
                = new StudentClone("Rahul", originalAddress);

        StudentClone shallowCopy = originalStudent.shallowClone();
        StudentClone deepCopy = originalStudent.deepClone();

        System.out.println("\nOriginal Student:");
        originalStudent.displayDetails();

        System.out.println("\nShallow Copy:");
        shallowCopy.displayDetails();

        System.out.println("\nDeep Copy:");
        deepCopy.displayDetails();

        // Modify the original address
        originalAddress.setCity("Panjim");

        System.out.println("\nAfter changing original address:");

        System.out.println("\nOriginal Student:");
        originalStudent.displayDetails();

        System.out.println("\nShallow Copy:");
        shallowCopy.displayDetails();

        System.out.println("\nDeep Copy:");
        deepCopy.displayDetails();
// =====================================
// 14. RUNTIME TYPE IDENTIFICATION (RTTI)
// =====================================
        System.out.println("\n--- RUNTIME TYPE IDENTIFICATION ---");

        RTTIDemo.displayRuntimeType(s1);
        RTTIDemo.displayRuntimeType(t1);

    }
}
