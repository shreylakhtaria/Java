import java.util.Scanner;
// parent class
class Member {
    String name;
    int age;
    long phoneNumber;
    String address;
    float salary;

    void printSalary() 
    {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Prac4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee employee = new Employee();
        System.out.print("Enter employee name: ");
        employee.name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        employee.age = scanner.nextInt();
        System.out.print("Enter employee phone number: ");
        employee.phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter employee address: ");
        employee.address = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        employee.salary = scanner.nextFloat();
        scanner.nextLine(); // new line buffer just like fflush(stdin) in C or C++
        System.out.print("Enter employee specialization: ");
        employee.specialization = scanner.nextLine();

        Manager manager = new Manager();
        System.out.print("Enter manager name: ");
        manager.name = scanner.nextLine();
        System.out.print("Enter manager age: ");
        manager.age = scanner.nextInt();
        System.out.print("Enter manager phone number: ");
        manager.phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter manager address: ");
        manager.address = scanner.nextLine();
        System.out.print("Enter manager salary: ");
        manager.salary = scanner.nextFloat();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter manager department: ");
        manager.department = scanner.nextLine();

        scanner.close();

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
