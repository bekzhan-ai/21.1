package Main2;

public class Developer extends Employee {

    public Developer(){
    }
    @Override
    public void goToVacation(){
        System.out.println("\nI am going to bootcamp!");
    }

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer(String grades) {
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

   private String grades;
    @Override
   public void print(){
       System.out.println("Developer " +
               "fio: " + getFio() +
               ", age: " + getAge() +
               ", salary: " + getSalary() +
               ", grades: " + getGrades());
   }
   public void writeCode(){
       System.out.println("I am writing code");
   }

    @Override
    public void goToDayOff(){
        System.out.println("- On vacation, you can fly abroad.");
    }
}
