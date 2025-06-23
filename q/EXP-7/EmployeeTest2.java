abstract class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary for " + role + " " + name + ": $" + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Fixed Salary: $" + fixedSalary);
    }
}

class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Salary for " + role + " " + name + ": $" + salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}

public class EmployeeTest2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 8000);
        Developer developer = new Developer("Bob", 50, 160);

        System.out.println("=== Manager Details ===");
        manager.displayDetails();
        manager.calculateSalary();

        System.out.println("\n=== Developer Details ===");
        developer.displayDetails();
        developer.calculateSalary();
    }
}
