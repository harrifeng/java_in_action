package cj.c04;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry hacker", 85000, 1989, 1, 15);
        staff[2] = new Employee("Tony Tester", 45000, 1990, 3, 15);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" +
                               e.getSalary() + ", hireDay=" +
                               e.getHireDay());
        }

        // As you do NOT return hireDay with clone, we can change it
        // via following, breaking the encapsulation

        //////////////////////////////////////////////////////////////////////
        // +------------+                                                   //
        // |Harry       |--------->+----------------------+                 //
        // +------------+          |                      |                 //
        //                         |    Employee          |                 //
        //                         | +------------+       |                 //
        // +------------+          | |  name      |       |                 //
        // |d           +---+      | +------------+       |                 //
        // +------------+   |      |                      |                 //
        //                  |      | +------------+       |                 //
        //                  |      | |  salary    |       |                 //
        //                  |      | +------------+       |                 //
        //                  |      |                      |                 //
        //                  |      | +------------+       |                 //
        //                  |      | |  hireDay   +---+   |                 //
        //                  |      | +------------+   |   |                 //
        //                  |      |                  |   |        +------+ //
        //                  |      +------------------+---+        |      | //
        //                  |                         |            | Date | //
        //                  |                         |            |      | //
        //                  |                         +----------->|      | //
        //                  |                                      |      | //
        //                  +------------------------------------->|      | //
        //                                                         |      | //
        //                                                         +------+ //
        //////////////////////////////////////////////////////////////////////

        Employee harry = new Employee("Harri", 2000000, 2008, 7, 4);
        Date d = harry.getHireDay();
        double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() - (long) tenYearsInMilliSeconds);
        System.out.println("Harry First on board date is " + harry.getHireDay());
    }
}

class Employee {
    private String name;
    private double salary;
    private Date hireDay;

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
