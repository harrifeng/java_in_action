package lang.cj.c05;

import lang.cj.c04.Employee;

/**
 * Created by hfeng on 14-1-3.
 */
public class ManagerTest {

  public static void main(String[] args) {
    Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);

    ////////////////////////////////////////////////
    // but you can’t call                         //
    // staff[0].setBonus(5000); // ERROR          //
    // The declared type of staff[0] is Employee, //
    // and the setBonus method is not a           //
    // method of the Employee class.              //
    ////////////////////////////////////////////////
    boss.setBonus(5000);
    Employee[] staff = new Employee[3];
    staff[0] = boss;
    staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
    staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

    for (Employee e : staff) {
      if (e instanceof Manager) {
        System.out.printf(e.getName() + " is a Manager\n");
      }
      System.out.println(e.getName() + " " + e.getSalary());
    }


  }
}
