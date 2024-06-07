package ObjectWithArray;

import java.util.Scanner;

public class ET {
    public static void main(String[] args) {
        // Store and print data of 10 employees
        Employee[] employees = new Employee[3];
        Scanner sc = new Scanner(System.in);

        // Writing data into the array
        for (int i = 0; i < employees.length; i++) {
            Employee e = new Employee();

            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("ID: ");
            e.setId(sc.nextInt());
            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            e.setName(sc.nextLine());

            System.out.print("Company: ");
            e.setCompany(sc.nextLine());

            System.out.print("Salary: ");
            e.setSalary(sc.nextDouble());
            sc.nextLine(); // Consume newline

            System.out.print("Department: ");
            e.setDepartment(sc.nextLine());

            System.out.print("Post: ");
            e.setPost(sc.nextLine());

            System.out.print("City: ");
            e.setCity(sc.nextLine());

            employees[i] = e;
        }

        //  all employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        //  total salary of employees
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }
        System.out.println("Total Salary of Employees: " + totalSalary);

        //  employees of IT department
        System.out.println("\nEmployees of IT Department:");
        for (Employee emp : employees) {
            if (emp.getDepartment().equalsIgnoreCase("IT")) {
                System.out.println(emp);
            }
        }

        // Count employees of Admin department
        int adminCount = 0;
        for (Employee emp : employees) {
            if (emp.getDepartment().equalsIgnoreCase("Admin")) {
                adminCount++;
            }
        }
        System.out.println("\nNumber of Employees in Admin Department: " + adminCount);

        // Count and print employees of a particular city
        System.out.print("\nEnter the city to find employees: ");
        String city = sc.nextLine();
        int cityCount = 0;
        System.out.println("\nEmployees in " + city + ":");
        for (Employee emp : employees) {
            if (emp.getCity().equalsIgnoreCase(city)) {
                cityCount++;
                System.out.println(emp);
            }
        }
        System.out.println("Number of Employees in " + city + ": " + cityCount);

        //  total salary of a particular department
        System.out.print("\nEnter the department to calculate total salary: ");
        String department = sc.nextLine();
        double departmentSalary = 0;
        for (Employee emp : employees) {
            if (emp.getDepartment().equalsIgnoreCase(department)) {
                departmentSalary += emp.getSalary();
            }
        }
        System.out.println("\nTotal Salary of " + department + " Department: " + departmentSalary);

        //highest and lowest salary of employees
        double highestSalary = employees[0].getSalary();
        double lowestSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > highestSalary) {
                highestSalary = emp.getSalary();
            }
            if (emp.getSalary() < lowestSalary) {
                lowestSalary = emp.getSalary();
            }
        }
        System.out.println("\nHighest Salary: " + highestSalary);
        System.out.println("Lowest Salary: " + lowestSalary);

    }
}
