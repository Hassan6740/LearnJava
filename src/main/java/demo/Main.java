import demo.*;

import java.io.IOException;
import java.util.Scanner;

void main() throws IOException {

    ConsoleStudentReader studentReader = new ConsoleStudentReader();
    CsvStudentWriter studentWriter = new CsvStudentWriter();

    ConsoleTeacherReader teacherReader = new ConsoleTeacherReader();
    CsvTeacherWriter teacherWriter = new CsvTeacherWriter();

    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("1 to Enter Student Information");
        System.out.println("2 to Enter Teacher Information");
        System.out.println("Q to quit");
        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '1':
                Student student = studentReader.read();
                System.out.println(student);
                studentWriter.write(student);
                break;

            case '2':
                Teacher teacher = teacherReader.read();
                System.out.println(teacher);
                teacherWriter.write(teacher);
                break;

            case 'Q':
            case 'q':
                System.out.println("Quitting the program...");
                System.exit(0);

            default:
                System.out.println("Invalid choice.");
                break;

        }
    }
}