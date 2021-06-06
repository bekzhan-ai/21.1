package Main;
import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.Math.cbrt;
public class Calculator {
    public static void main(String[] args) {
        //получаем модуль числа
        System.out.println(abs(-400.40));
        //возводит в степень
        System.out.println(pow(3,4));
        //генерирует случайное число, от 0.0 до 1.0
        System.out.println(random());
        //извлекает квадратный корень
        System.out.println(sqrt(9));
        //извлекает кубический корень
        System.out.println(cbrt(8));
    }
}
