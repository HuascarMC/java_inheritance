package example.codeclan.com.employeestartpoint;

/**
 * Created by huascar on 31/10/2017.
 */

public class Director extends Employee {
    private double budget;

    public Director(int id, String name, String socialSecurityNumber, double salary, double budget) {
        super(id, name, socialSecurityNumber, salary);
        this.budget = budget;

    }
}
