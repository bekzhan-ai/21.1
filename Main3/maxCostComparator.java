package Main3;

import java.util.Comparator;

public class maxCostComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        return Integer.compare(o2.getCost(), o1.getCost());

    }

}
