package console;

import pojo.Teacher;
import java.util.Scanner;

public class ConsoleTeacherReader {

    public Teacher read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Teacher Name: ");
        String name = in.nextLine();
        System.out.print("Enter Teacher Address: ");
        String address = in.nextLine();

        return new Teacher(name, address);
    }

}
