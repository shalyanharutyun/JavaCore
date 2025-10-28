package homework.employee;

import homework.library.Book;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void search(String ID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().contains(ID)) {
                System.out.println(employees[i]);
            }
        }
    }


    public void searchCompanyEmployee(String company) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getCompany().equalsIgnoreCase(company)) {
                System.out.println(employee);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No employees found for company: " + company);
        }
    }

}

