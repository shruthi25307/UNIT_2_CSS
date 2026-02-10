import java.util.*;
abstract class Employee {
    private String name;
    private String address;
    private double salary;
    private int experience;
    public Employee(String name, String address, double salary, int experience) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.experience = experience;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
    public int getExperience() {
        return experience;
    }
    public abstract void displayDetails();
}
class EmployeePayroll extends Employee {
    public EmployeePayroll(String name, String address, double salary, int experience) {
        super(name, address, salary, experience);
    }
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Years of Experience: " + getExperience());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== ENTER EMPLOYEE DETAILS =====");
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();
        EmployeePayroll emp = new EmployeePayroll(name, address, salary, experience);
        emp.displayDetails();
        sc.close();
    }
}
