package example.codeclan.com.employeestartpoint;

/**
 * Created by huascar on 31/10/2017.
 */

public class Manager extends Employee {
    private String dptName;

    public Manager(int id, String name, String socialSecurityNumber, double salary, String dptName) {
        this.id = id;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
        this.dptName = dptName;
    }
}
