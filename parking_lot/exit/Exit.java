package parking_lot.exit;

import parking_lot.parking_spot_manager.ParkingSpotManager;
import parking_lot.ticket.Ticket;

public class Exit {

    ParkingSpotManager parkingSpotManager;
    CostComputation costComputation;
    Payment payment;

    public Exit(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
        this.costComputation = new CostComputation();
        this.payment = new Payment();
    }

    public void exitVehicle(Ticket ticket) {

        int amount = costComputation.priceCalculation(ticket);

        payment.pay(amount);

        parkingSpotManager.removeVehicle(ticket.vehicle);
    }
}