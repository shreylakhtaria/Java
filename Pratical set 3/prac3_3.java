// Author : Shrey Lakhtaria

    class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String firstName, String lastName, double monthlySalary)
     {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}

public class prac3_3
{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Shrey", "Lak", 5000.0);
        Employee employee2 = new Employee("prince", "Lad", 6000.0);

        System.out.println("Yearly salary of employee1: " + employee1.getYearlySalary());
        System.out.println("Yearly salary of employee2: " + employee2.getYearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(11);

        System.out.println("Yearly salary of employee1 after raise: " + employee1.getYearlySalary());
        System.out.println("Yearly salary of employee2 after raise: " + employee2.getYearlySalary());
    }
}