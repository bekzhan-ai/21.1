package Main2;

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

    int levels;

  public void print(){
      System.out.println("Specialist " +
              "fio: " + fio +
              ", age: " + age +
              ", salary: " + salary +
              ", levels: " + levels);
  }
  public void workWithClients(){
      System.out.println("I work with a client");
  }
}
