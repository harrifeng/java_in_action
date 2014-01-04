package cj.c05;

import cj.c04.Employee;

/**
 * Created by hfeng on 14-1-3.
 */
public class Manager extends Employee{
    private double bonus;
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }
}
