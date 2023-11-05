package Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private final int id;
    private final static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    private int count = 0;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    private static double salary = 30000;

    /**
     *
     * @param firstName
     * @param lastName
     * @param dateOfBirth date with format "dd.MM.yyyy"
     * @throws ParseException
     */
    public Employee(String firstName, String lastName, String dateOfBirth) throws ParseException {
        this.id = count;
        count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = formatter.parse(dateOfBirth);
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    protected static void addSalary(double allowance) {
        salary += allowance;
    }

    public int compareDates(Date dateFirst, Date dateSecond) {
        return dateFirst.compareTo(dateSecond);
    }

    @Override
    public int compareTo(Employee other) {
        return this.dateOfBirth.compareTo(other.getDateOfBirth());
    }
}
