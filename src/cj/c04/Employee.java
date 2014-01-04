package cj.c04;

import cj.c05.Person;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by hfeng on 14-1-3.
 */

public class Employee  extends Person {
    private double salary;
    private Date hireDay;

    public Employee() {
        super("default");
        salary = 100.0;
        hireDay = new GregorianCalendar().getTime();
    }

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1,
                day);
        // GregorianCalendar uses 0 for January
        hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        //False way, should use cloen
        // return hireDay.clone();
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }
        Employee other = (Employee) otherObject;

        return salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return  Objects.hash(super.getName(), salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name=" + super.getName() + ",salary="
                + salary + ", hireDay=" + hireDay + "]";
    }
}
