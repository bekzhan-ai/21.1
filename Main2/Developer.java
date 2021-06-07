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

    public enum gradesDev {
        JUNIOR("I am junior developer"),
        MIDDLE("I am middle developer"),
        SENIOR("I am senior developer"),
        TEAMLEAD("I am teamlead developer");

        String phrase;

        gradesDev(String phrase) {
            this.phrase = phrase;
        }

        gradesDev() {

        }


        public static void printPhrase(gradesDev gradesDev) {
                switch (gradesDev) {
                    case JUNIOR -> System.out.println(JUNIOR.phrase);
                    case MIDDLE -> System.out.println(MIDDLE.phrase);
                    case SENIOR -> System.out.println(SENIOR.phrase);
                    case TEAMLEAD -> System.out.println(TEAMLEAD.phrase);

                }

        }
    }

    public void printDeveloperGrade() {
        switch (getGrades()) {
            case JUNIOR -> System.out.println(gradesDev.JUNIOR.phrase);
            case MIDDLE -> System.out.println(gradesDev.MIDDLE.phrase);
            case SENIOR -> System.out.println(gradesDev.SENIOR.phrase);
            case TEAMLEAD -> System.out.println(gradesDev.TEAMLEAD.phrase);
        }
    }


}
