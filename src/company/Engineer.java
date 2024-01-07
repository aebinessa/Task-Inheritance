package company;

import java.util.Arrays;

public class Engineer extends Employee {
    private String specialization;

    private String[] Skills;

    public String[] getSkills() {
        return Skills;
    }

    public void setSkills(String[] skills) {
        Skills = skills;
    }

    public Engineer(String name, String department, double salary, String specialization, String[] Skills) {
        super(name, department, salary);
        this.specialization = specialization;
        this.Skills = Skills;
    }

    @Override
    public String toString() {
        return super.toString() + ", Skills: " + Arrays.toString(Skills);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
