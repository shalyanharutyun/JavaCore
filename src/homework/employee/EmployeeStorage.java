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


    public void searchCompanyEmployee(String company){
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(company)) {
                System.out.println(employees[i]);
            }
        }
    }
}

