package Manager;

import Employee.Employee;

public class Manager extends Employee {

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }
    @Override
    public  void goToVacation(){
        System.out.println("\nI'm going home!");
    }
    public Manager(){
    }
    public boolean getHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    private boolean hasStocks;
    @Override
    public void print(){
        System.out.println("Manager " +
                "fio: " + getFio() +
                ", age: " + getAge() +
                ", salary: " + getSalary() +
                ", hasStocks: " + getHasStocks());

    }
    public void writeProcedures(){
        System.out.println("I am developing procedures");
    }

    @Override
    public void goToDayOff(){
        System.out.println("- You must rest because you are working hard.");
    }


}
