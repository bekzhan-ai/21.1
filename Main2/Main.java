package Main2;



public class Main {



    public static void main(String[] args) {



        Specialist oleksandrKostyliev = new Specialist("Oleksandr Kostyliev", 23, 30000, 3);
        Employee.addEmployees(oleksandrKostyliev);


        System.out.println("-----------------------------");

        Specialist denisSharipov = new Specialist("Denis Sharipov", 22, 30000, 3);
        Employee.addEmployees(denisSharipov);

        System.out.println("-----------------------------");

        Specialist andriiGorodenskyi = new Specialist("Andrii Gorodenskyi", 34, 48000, 4);
        Employee.addEmployees(andriiGorodenskyi);

        System.out.println("-----------------------------");

        Developer peterRasmussen = new Developer("Peter Rasmussen", 28, 70000, Developer.gradesDev.MIDDLE);
        Employee.addEmployees(peterRasmussen);


        System.out.println("-----------------------------");

        Developer andreasHojsleth = new Developer("Andreas Højsleth", 25, 40000, Developer.gradesDev.JUNIOR);
        Employee.addEmployees(andreasHojsleth);


        System.out.println("-----------------------------");

        Developer lukasRossander = new Developer("Lukas Rossander", 25, 40000, Developer.gradesDev.JUNIOR);
        Employee.addEmployees(lukasRossander);


        System.out.println("-----------------------------");

        Developer emilReif = new Developer("Emil Reif", 23, 35000, Developer.gradesDev.JUNIOR);
        Employee.addEmployees(emilReif);



        System.out.println("-----------------------------");

        Manager kennySchrub = new Manager("Kenny Schrub", 25, 35000, true);
        Employee.addEmployees(kennySchrub);

        System.out.println("-----------------------------");

        Manager nemanjaKovac = new Manager("Nemanja Kovac", 25, 30000, false);
        Employee.addEmployees(nemanjaKovac);


        System.out.println("-----------------------------");

        CEO mmSilver = new CEO("Matchmaking Silver", 18, 200000, true, true);
        Employee.addEmployees(mmSilver);


        System.out.println("-----------------------------");

       for (Developer.gradesDev grades : Developer.gradesDev.values()) {
           Developer.gradesDev.printPhrase(grades);
       }
    }
}