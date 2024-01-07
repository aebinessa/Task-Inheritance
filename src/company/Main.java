package company;

public class Main {
    public static void main(String[] args) {

        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        SalesPerson bader = new SalesPerson("bader essam jumma", "Call center", 1200, 300);
        Director faris = new Director("faris al faris", "HR", 3000, 0);
        Engineer abdullah = new Engineer("abdullah bin essa", "Development", 1000, "Web development",
                new String[] { "java", "ios", "linux" });

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(bader);
        System.out.println(faris);
        System.out.println(abdullah);
    }
}