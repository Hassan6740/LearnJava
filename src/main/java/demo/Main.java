import demo.Teacher;
import demo.Student;

import java.util.Scanner;

java.util.Scanner
void main(){
    int choice;
    System.out.println("Enter choice: ");
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    switch (choice) {
        case 1:{
            System.out.println("Student");
            break;
        }
        case 2: {
            System.out.println("Teacher");
            break;
        }
        case 'Q': {
            System.out.println("Quit");
        }

    }
}