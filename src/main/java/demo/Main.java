import demo.Teacher;
import demo.Student;

import java.io.IOException;
import java.util.Scanner;  // Import the Scanner class

void main() throws IOException {
    System.out.println("1 to Enter Student Information");
    System.out.println("2 to Enter Teacher Information");
    System.out.println("Q to quit");
    System.out.print("Enter your choice: ");
    Scanner sc = new Scanner(System.in);
    char choice = sc.next().charAt(0);
    switch (choice) {
        case '1': {
            Student s1 = new Student();
            s1.getStudent();
            s1.displayStudent();
            s1.studentWrite();
            break;
        }
        case '2': {
            Teacher t1 = new Teacher();
            t1.getTeacher();
            t1.displayTeacher();
            t1.writeTeacher();
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