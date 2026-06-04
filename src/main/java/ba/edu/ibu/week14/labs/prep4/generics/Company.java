package ba.edu.ibu.week14.labs.prep4.generics;

import java.util.ArrayList;
import java.util.List;

public class Company<T extends Employee> {
    private List<T> staff;

    public Company() {
        staff = new ArrayList<>();
    }

    public void add(T employee) {
        staff.add(employee);
    }

    public List<T> filterByName(String name) {
        List<T> result = new ArrayList<>();
        for (T employee : staff) {
            if (employee.getName().equals(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    public T getById(int id) {
        for (T employee : staff) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
