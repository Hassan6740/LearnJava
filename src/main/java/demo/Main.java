import demo.*;

import java.io.IOException;
import java.util.Scanner;  // Import the Scanner class

void main() throws IOException {
    System.out.println("1 to Enter Student Information");
    System.out.println("2 to Enter Teacher Information");
    System.out.println("Q to quit");
    System.out.print("Enter your choice: ");

    ConsoleStudentReader studentReader = new ConsoleStudentReader();
    CsvStudentWriter studentWriter = new CsvStudentWriter();

    ConsoleTeacherReader teacherReader = new ConsoleTeacherReader();
    CsvTeacherWriter teacherWriter = new CsvTeacherWriter();

    Scanner sc = new Scanner(System.in);
    char choice = sc.next().charAt(0);
    switch (choice) {
        case '1': {
            Student student = studentReader.read();
            System.out.println(student);
            studentWriter.write(student);
            break;
        }
        case '2': {
            Teacher teacher = teacherReader.read();
            System.out.println(teacher);
            teacherWriter.write(teacher);
            break;
        }
        case 'Q':
        case 'q': {
            System.out.println("Quitting the program...");
            break;
        }
        default: {
            System.out.println("Invalid choice.");
            break;
        }
    }
}