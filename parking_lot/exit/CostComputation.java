package parking_lot.exit;

import parking_lot.ticket.Ticket;

public class CostComputation {

    public int priceCalculation(Ticket ticket) {

        long exitTime = System.currentTimeMillis();

        long duration = exitTime - ticket.entryTime;

        // milliseconds to hours
        long hours = duration / (1000 * 60 * 60);

        // minimum 1 hour charge
        if (hours == 0) {
            hours = 1;
        }

        return (int) (hours * ticket.parkingSpot.price);
    }
}