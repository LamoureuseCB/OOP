package employee;

public class TestEmployee {
    public static void main(String[] args) {

        Manager manager = new Manager("Иван"," " , 2500, "Образование");
        Developer developer = new Developer("Евгений", " ", 2000, "Java");


        manager.displayInfo();
        System.out.println();
        developer.displayInfo();
    }
}
