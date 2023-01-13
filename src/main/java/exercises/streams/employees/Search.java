package exercises.streams.employees;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Search {

    /**
     * List of employees
     */
    List<Employee> listEmployees = new ArrayList<Employee>();
    /*
    List of employees grouped by job title
     */
    Map<String, List<Employee>> employeesGroupedByTittle = new HashMap<>();

    /**
     * Print Employees list grouped by job title
     */
    public void printEmployeesGroupedByTitle() {
        createList();
        groupByTitle();
        Set<String> keySet = employeesGroupedByTittle.keySet();
        Collection<List<Employee>> values = employeesGroupedByTittle.values();
        Set<Entry<String, List<Employee>>> entrySet = employeesGroupedByTittle.entrySet();

        for (Entry<String, List<Employee>> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    /**
     * Group list of employees by job title and assign results to the map
     */
    private void groupByTitle() {
        this.employeesGroupedByTittle = listEmployees
                .stream()
                .collect(Collectors.groupingBy(Employee::getTittle));

    }

    /**
     * Create employees and add them to the employees list
     */
    private void createList() {
        Employee e1 = new Employee("Monika", "Nowak", "Software Test Engineer", 8000, Level.A2.toString());
        Employee e2 = new Employee("Marika", "Nowak", "Software Test Automation Engineer", 10000, Level.A2.toString());
        Employee e3 = new Employee("Marek", "Nowak", "Software Engineer", 12000, Level.A2.toString());
        Employee e4 = new Employee("Krystian", "Nowak", "Software Test Engineer", 8000, Level.A2.toString());
        Employee e5 = new Employee("Bartek", "Nowak", "Software Test Engineer", 8000, Level.A2.toString());
        Employee e6 = new Employee("Angelika", "Nowak", "Software Engineer", 12500, Level.A2.toString());
        Employee e7 = new Employee("Krystian", "Tadeusz", "Software Test Engineer", 8000, Level.A2.toString());
        Employee e8 = new Employee("Ania", "Sikorska", "Software Test Engineer", 8000, Level.A2.toString());
        Employee e9 = new Employee("Maria", "Kwapisz", "Software Architect", 20000, Level.C.toString());
        Employee e10 = new Employee("Piotr", "Kowal", "Software Test Engineer", 8000, Level.A2.toString());
        Employee e11 = new Employee("Szymon", "Krawczyk", "Delivery Manager", 30000, Level.D.toString());
        Employee e12 = new Employee("Ola", "Nowak", "Software Test Engineer", 8000, Level.A2.toString());
        listEmployees.add(e1);
        listEmployees.add(e2);
        listEmployees.add(e3);
        listEmployees.add(e4);
        listEmployees.add(e5);
        listEmployees.add(e6);
        listEmployees.add(e7);
        listEmployees.add(e8);
        listEmployees.add(e9);
        listEmployees.add(e10);
        listEmployees.add(e11);
        listEmployees.add(e12);
    }
}
