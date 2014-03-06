package lang.cj.c04;

public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Teting tripleValue----------:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        System.out.println("\nTeting tripleSalary----------:");
        Employee harry = new Employee("Harri", 2000000, 2008, 7, 4);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        System.out.println("\nTeting swap----------:");
        Employee a = new Employee("Alice", 70000, 2008, 7, 4);
        Employee b = new Employee("Bob", 60000, 2008, 7, 4);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());
    }
    public static void tripleValue(double x) { // dose not work
        x = 3 *x;
        System.out.println("End of method: x=" + x);
    }
    public static void tripleSalary(Employee x) {// works
        x.raiseSalary(20);
        System.out.println("End of method: salary=" + x.getSalary());
    }
    public static void swap(Employee x, Employee y) {//does not work
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}
