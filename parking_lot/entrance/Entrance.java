package parking_lot.entrance;

import parking_lot.parking_slot.ParkingSpot;
import parking_lot.parking_spot_manager.ParkingSpotManager;
import parking_lot.ticket.Ticket;
import parking_lot.vehicle.Vehicle;

public class Entrance {
    public int id;
    ParkingSpotManager parkingSpotManager;
    public Entrance(int id, ParkingSpotManager parkingSpotManager) {
        this.id = id;
        this.parkingSpotManager = parkingSpotManager;
    }

    public ParkingSpot findSpace() {
        return parkingSpotManager.findParkingSpot();
    }
    public void bookSlot(Vehicle vehicle, ParkingSpot spot) {
        spot.parkingVehicle(vehicle);
    }
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot) {
        return new Ticket(
                System.currentTimeMillis(),
                vehicle,
                spot
        );
    }
}
