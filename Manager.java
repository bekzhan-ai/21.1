package Main2;

public class Manager extends Employee {

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager(){
    }
    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    boolean hasStocks;

    public void print(){
        System.out.println("Manager " +
                "fio: " + fio +
                ", age: " + age +
                ", salary: " + salary +
                ", hasStocks: " + hasStocks);

    }
    public void writeProcedures(){
        System.out.println("I am developing procedures");
    }
}
