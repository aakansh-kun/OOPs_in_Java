class Employee {
    String name;
    int empid;
    double salary;
    private static int id= 1000; 
    public Employee() {
        this.name = "Unknown";
        this.empid = id++;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000);
        emp1.displayEmployeeInfo();
        
        emp1.increaseSalary(10);
        System.out.println("After salary increase:");
        emp1.displayEmployeeInfo();

        System.out.println();

        Manager mgr1 = new Manager("Alice Smith", 102, 70000, "IT");
        mgr1.displayManagerInfo();

        mgr1.increaseSalary(15);
        System.out.println("After salary increase:");
        mgr1.displayManagerInfo();
    }
}