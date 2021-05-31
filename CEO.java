package Main2;

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

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    boolean hasCompanyCar;



    public void print(){
        System.out.print("CEO " +
                "fio: " + fio +
                ", age: " + age +
                ", salary: " + salary +
                ", hasStocks: " + hasStocks +
                ", hasCompanyCar: " + hasCompanyCar);

    }
    public void goPublic(){
        System.out.println("I am working on an IPO");
    }
}
