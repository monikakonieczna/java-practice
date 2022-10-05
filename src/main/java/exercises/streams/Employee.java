package exercises.streams;

import lombok.Getter;

public class Employee {

    String firstname;
    String lastname;
    @Getter
    String tittle;
    Integer salary;
    String level;

    public Employee(String firstname, String lastname, String tittle, Integer salary, String level) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.tittle = tittle;
        this.salary = salary;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", tittle='" + tittle + '\'' +
                ", salary=" + salary +
                ", level='" + level + '\'' +
                '}';
    }
}
