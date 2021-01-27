/*
 * This class is a simple example of creating an array of objects
 */
package studentlist;
import java.util.Scanner;


/**
 *
 * @author markb
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // changed array size to 3
        Student[] students = new Student[3];
    

        for (int i = 0; i < students.length; i++) {
       
            System.out.println("Enter the students name");
            String name = input.nextLine();
            Student student = new Student(name);
       
            students[i] = student;
        }
        System.out.println("Printing the students:");
        String format = "The student's name is %s\n";     
        for (Student student: students) {
        System.out.printf(format, student.getName());   
        
        }
 

       }
}

    