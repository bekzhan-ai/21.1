package Main3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String>books = new ArrayList<>();

        books.add("Меняя маски");
        books.add("Небесный шаг");
        books.add("Дитя");
        books.add("Хрономаг");
        books.add("Резчик");
        System.out.println(books);

        books.remove(books.size() - 1);
        System.out.println(books);

        books.set(books.size() - 1, "Резчик"); //хм, мне кажется, что тут, что не так
        System.out.println(books);

        books.clear();
        System.out.println(books);

        books.add("Искатель ветра");
        books.add("Нерождённый");
        books.add("Вечный Данж");
        System.out.println(books);


    }
}
