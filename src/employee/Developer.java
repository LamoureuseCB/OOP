package employee;

public class Developer extends Employee{
    String mainProgrammingLanguage;
    public Developer(String name, String position, int salary,String mainProgrammingLanguage){
        super(name, "Разработчик", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

        @Override
        public void displayInfo() {

            super.displayInfo();
            System.out.println("Язык программирования: " + mainProgrammingLanguage);

        }
}
