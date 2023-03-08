package exercises.garbage_collector;

/**
 * Write a program to count the number of employees working in the company(excluding interns).
 * Write a program to create a class called Employee having the following data members.
 *
 * 1. An ID for storing unique id allocated to every employee.
 * 2. Name of employee.
 * 3. age of an employee.
 *
 * Also, provide the following methods:
 *
 * A parameterized constructor to initialize name and age. The ID should be initialized in this constructor.
 * A method show() to display ID, name, and age.
 * A method showNextId() to display the ID of the next employee.
 */
public class Employee {

    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show(){
        System.out.println("Id=" + ID + "\nName=" + name
                + "\nAge=" + age);
    }
    public void showNextId(){
        System.out.println("Next employee id will be="
                + nextId);
    }

    protected void finalize(){
        --nextId;
    }
}
