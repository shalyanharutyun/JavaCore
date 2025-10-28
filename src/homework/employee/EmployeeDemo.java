package homework.employee;

import homework.library.Book;
import homework.library.BookStorage;

import java.util.Scanner;

public class EmployeeDemo implements EmployeeCommands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printEmployeeCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmploye();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEID:
                System.out.println("Please input keyword");
                String id = scanner.nextLine();
                employeeStorage.search(id);
                break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println("Please input keyword");
                    String company = scanner.nextLine();
                    employeeStorage.searchCompanyEmployee(company);
                    break;
                default:
                    System.err.println("wrong cammand, try again");
            }
        }
    }

    private static void addEmploye() {
        System.out.println("Please input Employee's name");
        String name = scanner.nextLine();
        System.out.println("Please input Employee's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input Employee's emplyeeID");
        String emplyeeID = scanner.nextLine();
        System.out.println("Please input Employee's salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input company");
        String company = scanner.nextLine();
        System.out.println("Please input Employee's position");
        String position = scanner.nextLine();
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setEmplyeeID(emplyeeID);
        employee.setSalary(salary);
        employee.setCompany(company);
        employee.setPosition(position);
        employeeStorage.add(employee);
        System.out.println("Employee added successfuly");
    }

    private static void printEmployeeCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for Add Employe");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_EMPLOYEID + " for Search Employee By EmployeID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for Search Employee By Company Name");

    }

}

