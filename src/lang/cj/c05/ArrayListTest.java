package lang.cj.c05;

import java.util.ArrayList;

import lang.cj.c04.Employee;

/**
 * Created by hfeng on 1/4/14.
 */
public class ArrayListTest {

  public static void main(String[] args) {
    ArrayList<Employee> staff = new ArrayList<Employee>();
    staff.add(new Employee("Carl Cracker", 750000, 1987, 12, 15));
    staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
    staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

    // raise everyone's salary by 5%
    for (Employee e : staff) {
      e.raiseSalary(5);
    }

    for (Employee e : staff) {
      System.out.println("name=" + e.getName() + ",salary=" + e.getSalary()
                         + ",hireDay=" + e.getHireDay());
    }
  }
}
