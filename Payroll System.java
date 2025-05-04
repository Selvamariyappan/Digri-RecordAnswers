import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String name;
    private int employeeId;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, int employeeId, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + calculateGrossPay());
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
           
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] details = input.split(", ");
            if (details.length == 4) {
                String name = details[0];
                int employeeId = Integer.parseInt(details[1]);
                double hourlyRate = Double.parseDouble(details[2]);
                double hoursWorked = Double.parseDouble(details[3]);

                Employee employee = new Employee(name, employeeId, hourlyRate, hoursWorked);
                employees.add(employee);
            } else {
                System.out.println("Invalid input. Please enter details in the format: Name, ID, HourlyRate, HoursWorked");
            }
        }

        System.out.println("Employee Details");
        System.out.println("-----------------");
        for (Employee employee : employees) {
            employee.printDetails();
        }

        scanner.close();
    }
}