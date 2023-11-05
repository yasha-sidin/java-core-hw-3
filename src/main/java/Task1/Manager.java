package Task1;

import Task1.Employee;

import java.text.ParseException;

public class Manager extends Employee {
    private static double salary = 50000;

    /**
     * @param firstName
     * @param lastName
     * @param dateOfBirth date with format "dd.MM.yyyy"
     * @throws ParseException
     */
    public Manager(String firstName, String lastName, String dateOfBirth) throws ParseException {
        super(firstName, lastName, dateOfBirth);
    }

    public static void increaseSale(double allowance) {
        Employee.addSalary(allowance);
    }

    @Override
    public double getSalary() {
        return salary;
    }

}
