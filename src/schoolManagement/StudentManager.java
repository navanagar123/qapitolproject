package schoolManagement;

import java.io.PipedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int input;
     do {
         System.out.println("menu");
         System.out.println("1:" + "Add student");
         System.out.println("2:" + "Add Teacher");
         System.out.println("3:" + "exit");
         System.out.println("enter your choice");
         input = sc.nextInt();
         switch (input) {
             case 1:
                 System.out.println("enter the student details");

                 System.out.println("enter the id ");
                 int id = sc.nextInt();
                 System.out.println("enter the name");
                 String name = sc.next();
                 System.out.println("enter the age");
                 int age = sc.nextInt();
                 System.out.println("enter the course");
                 String courses = sc.next();
                 System.out.println("enter the marks");
                 int marks = sc.nextInt();


                 Student stu = new Student();
                 stu.setId(id);
                 stu.setName(name);
                 stu.setAge(age);
                 stu.setCources(courses);
                 stu.setMarks(marks);

                 ArrayList<Student> st = new ArrayList<Student>();
                 st.add(stu);

                 stu.displayDetails();
                 stu.CalculateGrade();
                 break;

             case 2:
                 System.out.println("enter the Teacher details");
                 Scanner sc1 = new Scanner(System.in);
                 System.out.println("enter the id of Teacher ");
                 int idOfTeacher = sc1.nextInt();
                 System.out.println("enter the name of Teacher ");
                 String nameOfTeacher = sc1.next();
                 System.out.println("enter the age of Teacher");
                 int ageOfTeacher = sc1.nextInt();
                 System.out.println("enter the subject");
                 String subject = sc1.next();
                 System.out.println("enter the salary");
                 double salary = sc1.nextDouble();


                 Teacher t = new Teacher();
                 t.setId(idOfTeacher);
                 t.setName(nameOfTeacher);
                 t.setAge(ageOfTeacher);
                 t.setSubject(subject);
                 t.setSalary(salary);

                 ArrayList<Teacher> tt = new ArrayList<Teacher>();
                 tt.add(t);
                 t.displayDetails();

                 break;
             case 3:
                 System.out.println("exiting");
             default:
                 System.out.println("enter correct choice");


         }


     } while (input > 3);

 }




















 }



