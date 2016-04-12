package com.example.test.testexampleapplication.abst;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2016/4/11.
 */
class Employee extends Person {

    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();

    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public double raiseSalary(int byPercent) {
        double raise = salary * byPercent / 100;
        return salary += raise;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }


}
