package Task2;

import Task1.Employee;
import Task1.Manager;

import java.text.ParseException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ParseException {
        Employee emp1 = new Employee("John", "Serge", "22.12.2000");
        Employee emp2 = new Employee("Max", "Zero", "13.12.2001");
        Manager manager = new Manager("Fred", "Tomson", "15.08.1999");
        Employee[] arr = new Employee[3];
        arr[0] = emp1;
        arr[1] = emp2;
        arr[2] = manager;
        Manager.increaseSale(10000);
        Arrays.stream(arr).forEach(x -> System.out.println(x.getSalary() + "\n"));
    }

}
