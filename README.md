
# DCST NIRF Information Management System

**Author:** Magnus Rodrigues  
**Roll Number:** 2628  
**Department:** Computer Science and Technology (DCST)  
**University:** Goa University

## Project Overview

The DCST NIRF Information Management System is a Java-based application developed to demonstrate the practical implementation of Object-Oriented Programming concepts.

The project models basic department-related information and demonstrates object management, student and staff records, reporting, collections, exception handling, persistence, and other Java features.

## Technologies Used

- Java
- Object-Oriented Programming
- Java Collections Framework
- Java File Handling
- Java Serialization
- Java Reflection

## Project Structure

```text
DCST-NIRF-Management-System/
│
├── code/
│   ├── Main.java
│   ├── model/
│   ├── interfaces/
│   ├── services/
│   ├── exceptions/
│   ├── utilities/
│   └── external/
│
├── output/
│   ├── student.ser
│   ├── student.txt
│   └── screenshots/
│
└── README.md
```

## OOP Concepts Implemented

1. Objects, constructors and object references
2. Static attributes, static methods and enums
3. Multiple inheritance using interfaces
4. Access modifiers
5. Abstract classes and interfaces
6. Classes as types and message passing
7. Polymorphism:
   - Method overloading
   - Method overriding
8. Generics and collections:
   - List
   - Queue
   - Set
   - Map
9. Exception handling:
   - try-catch-finally
   - throw
   - Custom exceptions
10. Advanced Java features:
    - Reflection
    - Object persistence
    - Console input/output
    - File handling
    - Runtime Type Identification (RTTI)
    - Shallow cloning
    - Deep cloning

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 21 or compatible version)
- Visual Studio Code or another Java IDE

### Compilation

Open the terminal in the project root directory and execute:

```powershell
javac -d code code\Main.java code\model\*.java code\interfaces\*.java code\services\*.java code\exceptions\*.java code\utilities\*.java
```

### Execution

```powershell
java -cp code Main
```

The application demonstrates the implemented OOP concepts through console output.

Some sections also request user input through the terminal.

## Generated Files

The application generates:

- `output/student.ser` – Serialized student object.
- `output/student.txt` – Student information stored as a text file.

## Project Author

**Magnus Rodrigues**  
**Roll Number: 2628**

DCST – Goa University
