package Main3;


import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Ticket ticketForBestFriend = new Ticket(0, true);
        Ticket ticketForPerson = new Ticket(50000, false);
        Ticket ticketForFriend = new Ticket(10000, true);
        Ticket ticketForVip = new Ticket(100000, true);
        Ticket ticketForFamily = new Ticket(0, true);
        Ticket ticketForFoe = new Ticket(1000000, false);
        Ticket ticketForFamiliar = new Ticket(30000, false);

        PriorityQueue<Ticket>maxCost = new PriorityQueue<>(new maxCostComparator());

        maxCost.add(ticketForBestFriend);
        maxCost.add(ticketForPerson);
        maxCost.add(ticketForFriend);
        maxCost.add(ticketForVip);
        maxCost.add(ticketForFamily);
        maxCost.add(ticketForFoe);
        maxCost.add(ticketForFamiliar);

        while (!maxCost.isEmpty()){
            System.out.println(maxCost.poll().getCost());
        }

        PriorityQueue<Ticket>hasVip = new PriorityQueue<>(new hasVipComparator());
        hasVip.add(ticketForBestFriend);
        hasVip.add(ticketForPerson);
        hasVip.add(ticketForFriend);
        hasVip.add(ticketForVip);
        hasVip.add(ticketForFamily);
        hasVip.add(ticketForFoe);
        hasVip.add(ticketForFamiliar);

        while (!hasVip.isEmpty()){
            System.out.println(hasVip.poll().isVIP());
        }
    }
}
