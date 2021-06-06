package Main2;




public class Main {



    public static void main(String[] args) {

        Specialist oleksandrKostyliev = new Specialist("Oleksandr Kostyliev", 23, 30000, 3);
        oleksandrKostyliev.print();
        Employee.addEmployees(oleksandrKostyliev);
        oleksandrKostyliev.goToDayOff();

        System.out.println("-----------------------------");

        Specialist denisSharipov = new Specialist("Denis Sharipov", 22, 30000, 3);
        denisSharipov.print();
        Employee.addEmployees(denisSharipov);
        denisSharipov.goToDayOff();

        System.out.println("-----------------------------");

        Specialist andriiGorodenskyi = new Specialist("Andrii Gorodenskyi", 34, 48000, 4);
        andriiGorodenskyi.print();
        Employee.addEmployees(andriiGorodenskyi);
        andriiGorodenskyi.goToDayOff();

        System.out.println("-----------------------------");

        Developer peterRasmussen = new Developer("Peter Rasmussen", 28, 70000, "Middle");
        peterRasmussen.print();
        Employee.addEmployees(peterRasmussen);
        peterRasmussen.goToDayOff();

        System.out.println("-----------------------------");

        Developer andreasHojsleth = new Developer("Andreas Højsleth", 25, 40000, "Junior");
        andreasHojsleth.print();
        Employee.addEmployees(andreasHojsleth);
        andreasHojsleth.goToDayOff();

        System.out.println("-----------------------------");

        Developer lukasRossander = new Developer("Lukas Rossander", 25, 40000, "Junior");
        lukasRossander.print();
        Employee.addEmployees(lukasRossander);
        lukasRossander.goToDayOff();

        System.out.println("-----------------------------");

        Developer emilReif = new Developer("Emil Reif", 23, 35000, "Junior");
        emilReif.print();
        Employee.addEmployees(emilReif);
        emilReif.goToDayOff();

        System.out.println("-----------------------------");

        Manager kennySchrub = new Manager("Kenny Schrub", 25, 35000, true);
        kennySchrub.print();
        Employee.addEmployees(kennySchrub);
        kennySchrub.goToDayOff();

        System.out.println("-----------------------------");

        Manager nemanjaKovac = new Manager("Nemanja Kovac", 25, 30000, false);
        nemanjaKovac.print();
        Employee.addEmployees(nemanjaKovac);
        nemanjaKovac.goToDayOff();

        System.out.println("-----------------------------");

        CEO mmSilver = new CEO("Matchmaking Silver", 18, 200000, true, true);
        mmSilver.print();
        Employee.addEmployees(mmSilver);
        mmSilver.goToDayOff();

        System.out.println("-----------------------------");


        Employee.goToVacationAll();

    }
}
