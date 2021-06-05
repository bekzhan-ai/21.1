package CEO;

import Manager.Manager;

public class CEO extends Manager {
    public CEO(boolean hasStocks, boolean hasCompanyCar) {
        super(hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(){
    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    private boolean hasCompanyCar;

    @Override
    public void goToVacation(){
        System.out.println("\nI am going to Hawaii!");
    }

    @Override
    public void print(){
        System.out.println("CEO " +
                "fio: " + getFio() +
                ", age: " + getAge() +
                ", salary: " + getSalary() +
                ", hasStocks: " + getHasStocks() +
                ", hasCompanyCar: " + getHasCompanyCar());

    }
    public void goPublic(){
        System.out.println("I am working on an IPO");
    }

    @Override
    public void goToDayOff(){
        System.out.println("- Take this damn vacation!");
    }
}
//this object == joke
