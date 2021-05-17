package org.example.principle.lkp;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Castle
 * @Date 2021/5/17 11:10
 */
public class Lkp {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        Manager manager = new Manager();
        manager.printAll(schoolManager);
    }
}

@Data
class Employee {
    private String id;
}

@Data
class SchoolEmployee {
    private String id;
}

class SchoolManager {
    public List<SchoolEmployee> getAllEmployee() {
        List<SchoolEmployee> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            SchoolEmployee schoolEmployee = new SchoolEmployee();
            schoolEmployee.setId(i + "");
            list.add(schoolEmployee);
        }
        return list;
    }
}

class Manager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId(i + "");
            list.add(employee);
        }
        return list;
    }

    public void printAll(SchoolManager schoolManager) {
        System.out.println("学院的员工");
        for (SchoolEmployee employee : schoolManager.getAllEmployee()) {
            System.out.println(employee);
        }
        System.out.println("****************");
        System.out.println("总部员工");
        for (Employee employee : this.getAllEmployee()) {
            System.out.println(employee);
        }
    }
}