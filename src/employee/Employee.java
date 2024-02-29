package employee;

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    public void displayInfo() {

        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
    }

}

