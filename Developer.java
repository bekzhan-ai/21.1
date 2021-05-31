package Main2;

public class Developer extends Employee {

    public Developer(){
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

    String grades;

   public void print(){
       System.out.println("Developer " +
               "fio: " + fio +
               ", age: " + age +
               ", salary: " + salary +
               ", grades: " + grades);
   }
   public void writeCode(){
       System.out.println("I am writing code");
   }
}
