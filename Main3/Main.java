package Main3;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();
        cars.push("Audi");
        cars.push("BMW");
        cars.push("Chevrolet");
        cars.push("Citroen");
        cars.push("Hyundai");

        System.out.println(cars);
        cars.pop();
        System.out.println(cars.peek());
        cars.search("Audi");
    }

}
