package Specialist;

import Employee.Employee;

public class Specialist extends Employee {

    public Specialist(){
    }

    public Specialist(int levels) {
        this.levels = levels;
    }

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

   private int levels;
    @Override
  public void print(){
      System.out.println("Specialist " +
              "fio: " + getFio() +
              ", age: " + getAge() +
              ", salary: " + getSalary() +
              ", levels: " + getLevels());
  }
    public void workWithClients(){
      System.out.println("I work with a client");
  }

    @Override
    public  void goToVacation(){
        System.out.println("\nI'm going to watch a movie 24/7!");
    }

    @Override
    public void goToDayOff(){
        System.out.println("- Leisure increases employee efficiency.");
    }
}
