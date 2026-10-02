package parking_lot.ticket;


import parking_lot.parking_slot.ParkingSpot;
import parking_lot.vehicle.Vehicle;
public class Ticket {
    public long entryTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;
    public Ticket(long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

}
