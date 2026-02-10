import java.io.*;
import java.util.*;
abstract class Course{
    private String courseName;
    private String courseCode;
    private int credits;
    public Course(String courseName, String courseCode, int credits){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public int getCredits(){
        return credits;
    }
    public abstract void showCourse();
}
class ElectiveCourse extends Course{
    private String category;
    public ElectiveCourse(String courseName, String courseCode,int credits, String category){
        super(courseName, courseCode, credits);
        this.category = category;
    }
    public void showCourse(){
        System.out.println("Elective: " + getCourseName());
        System.out.println("Code: " + getCourseCode());
        System.out.println("Credits: " + getCredits());
        System.out.println("Category: " + category);
    }
}
class Student{
    private String name;
    private String regNo;
    private int year;
    private String dept;
    private ElectiveCourse elective;
    public Student(String name, String regNo, int year,
                   String dept, ElectiveCourse elective){
        this.name = name;
        this.regNo = regNo;
        this.year = year;
        this.dept = dept;
        this.elective = elective;
    }
    public void displayStudentDetails(){
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("Year: " + year);
        System.out.println("Department: " + dept);
        System.out.println("\n--- Enrolled Course ---");
        elective.showCourse();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("         WELCOME TO COURSE MANAGEMENT SYSTEM          ");
        System.out.println("======================================================");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Elective Course Name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = sc.nextLine();
        System.out.print("Enter Credits: ");
        int credits = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        ElectiveCourse e1 = new ElectiveCourse(courseName, courseCode, credits, category);
        Student s1 = new Student(name, regNo, year, dept, e1);
        s1.displayStudentDetails();
        sc.close();
    }
}
