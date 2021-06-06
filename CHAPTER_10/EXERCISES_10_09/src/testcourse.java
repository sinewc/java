
import java.util.Scanner;

public class testcourse {

    public static void main(String[] args) {
        String name;
        int yn;
        Boolean chack = true, chackmenu = true, flag = true;

        Scanner input = new Scanner(System.in);
        // Create a course
        course oop = new course("OOP");
       
        oop.addStudent("hhh");
        oop.addStudent("kkk");
        oop.addStudent("lll");
        
        System.out.print("The students in the course "+ oop.getCourseName() + ":");
        String[] students = oop.getStudents();
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter addName : ");
        name = input.nextLine();
        // Add three students
        oop.addStudent(name);
        System.out.print("The students in the course "+ oop.getCourseName() + ":");
              students = oop.getStudents();
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter dropName : ");
        name = input.nextLine();
        // Add three students
        oop.dropStudent(name);
        
  
        System.out.print("The students in the course "+ oop.getCourseName() + ":");
           students = oop.getStudents();
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
        
        oop.clear();
        if(oop.numberOfStudents==0){
            System.out.println("no member");
        }
        System.out.print("The students in the course "+ oop.getCourseName() + ":");
           students = oop.getStudents();
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();       
    }
}
