package cj.c04;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by hfeng on 14-1-3.
 */

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee() {
        name = "default";
        salary = 100.0;
        hireDay = new GregorianCalendar().getTime();
    }

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1,
                day);
        // GregorianCalendar uses 0 for January
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
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
}
