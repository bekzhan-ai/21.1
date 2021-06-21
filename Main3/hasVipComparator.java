package Main3;

import java.util.Comparator;

public class hasVipComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return Boolean.compare(o2.isVIP(), o1.isVIP());
    }
}
