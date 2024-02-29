package employee;

public class Manager extends Employee {
    String department;

    public Manager(String name, String position, int salary, String department) {
        super(name, "Менеджер", salary);
        this.department = department;

    }
@Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Отдел: " + department);

    }
}








