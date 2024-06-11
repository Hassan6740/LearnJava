import demo.ConsoleStudentReader;
import demo.ConsoleTeacherReader;
import demo.CsvStudentReaderWriter;
import demo.CsvTeacherReaderWriter;
import demo.Student;
import demo.Teacher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

void main() throws IOException {

    ConsoleStudentReader studentReader = new ConsoleStudentReader();
    CsvStudentReaderWriter studentWriter = new CsvStudentReaderWriter();

    ConsoleTeacherReader teacherReader = new ConsoleTeacherReader();
    CsvTeacherReaderWriter teacherWriter = new CsvTeacherReaderWriter();

    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("1 to Enter Student Information");
        System.out.println("2 to Enter Teacher Information");
        System.out.println("3 to View Students Information from File");
        System.out.println("4 to View Teachers Information from File");
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
            case '3':
                //To View Student Info From File
                List<Student> student1 = studentWriter.read();
                System.out.println(student1);
                break;
            case '4':
                //To View Teacher Info From File
                List<Teacher> teacher1 = teacherWriter.read();
                System.out.println(teacher1);
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