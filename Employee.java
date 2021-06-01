package Main2;

public class Employee {

    public Employee(){
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String fio;
    private int age;
    private int salary;

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

   public void print(){
       System.out.println("Employee " +
               "fio: " + fio +
               ", age: " + age +
               ", salary: " + salary);
   }
   public void goToVacation(){
       System.out.println("I'm going to rest!");
   }
}
