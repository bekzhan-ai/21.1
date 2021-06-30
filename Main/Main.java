package Main;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        // Стоит использовать, если порядок вам не важен, но важна скорость
        // HashSet - хранит элементы в удобном ему порядке, но он быстрей, чем LinkedHashSet
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(1);

        for (Integer i:
             integerHashSet) {
            System.out.println(i);
        }

        System.out.println("------------------------------");

        // Стоит использовать, если вам важен порядок
        // LinkedHashSet - хранит элементы в порядке добавления, но он медленнее, чем HashSet
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(1);

        for (Integer i:
                integerLinkedHashSet) {
            System.out.println(i);
        }

    }
}
