package Main2;

public class Developer extends Employee {

    public Developer(){
    }
    @Override
    public void goToVacation(){
        System.out.println("\nI am going to bootcamp!");
    }

    public Developer(String fio, int age, int salary, gradesDev grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer(gradesDev grades) {
        this.grades = grades;
    }


    public gradesDev getGrades() {
        return grades;
    }

    public void setGrades(gradesDev grades) {
        this.grades = grades;
    }

    private gradesDev grades;
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

    public enum gradesDev{
        JUNIOR,
        MIDDLE,
        SENIOR,
        TEAMLEAD
    }

    public void printDeveloperGrade() {
        switch (getGrades()) {
            case JUNIOR -> System.out.println("I am junior developer");
            case MIDDLE -> System.out.println("I am middle developer");
            case SENIOR -> System.out.println("I am senior developer");
            case TEAMLEAD -> System.out.println("I am teamlead developer");
        }
    }
}
