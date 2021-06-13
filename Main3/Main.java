package Main3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int second = 1;
        int secondsPerMinute = 60 * second;
        int secondsPerHour = 60 * secondsPerMinute;
        int secondsPerDay = 24 * secondsPerHour;
        int secondsPerWeek = 7 * secondsPerDay;
        int secondsPerMonth = 30 * secondsPerDay;

        ArrayList<Integer>timeInSeconds = new ArrayList<>();
        timeInSeconds.add(secondsPerMonth);
        timeInSeconds.add(secondsPerWeek);
        timeInSeconds.add(secondsPerDay);
        timeInSeconds.add(secondsPerHour);
        timeInSeconds.add(secondsPerMinute);

        Collections.sort(timeInSeconds);

        int index = Collections.binarySearch(timeInSeconds, secondsPerHour);

        Collections.reverse(timeInSeconds);
        System.out.println(timeInSeconds);

        Collections.shuffle(timeInSeconds);

        System.out.println("Min: " + Collections.min(timeInSeconds));
        System.out.println("Max: " + Collections.max(timeInSeconds));

        Collections.fill(timeInSeconds, 42); //почему? потому что 42



    }
}
