package company;

public class Director extends Employee {
    private double budget;

    public Director(String name, String department, double salary, double budget) {
        super(name, department, salary);
        this.budget = budget;
    }
    // Getter and setter for doubleBudget

    @Override
    public String toString() {
        return super.toString() + ", double target: " + budget;
    }

    public double getbudget() {
        return budget;
    }

    public void setbudget(double budget) {
        this.budget = budget;
    }

}
