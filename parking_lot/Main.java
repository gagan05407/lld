package parking_lot;

import java.util.ArrayList;
import java.util.List;

import parking_lot.entrance.Entrance;
import parking_lot.exit.Exit;
import parking_lot.parking_slot.ParkingSpot;
import parking_lot.parking_slot.TwoWheelerSpot;
import parking_lot.parking_spot_manager.TwoWheelerSpotManager;
import parking_lot.ticket.Ticket;
import parking_lot.vehicle.Vehicle;
import parking_lot.vehicle.TwoWheeler;

public class Main {

    public static void main(String[] args) {

        // 1. Create parking spots
        List<ParkingSpot> twoWheelerSpots = new ArrayList<>();

        twoWheelerSpots.add(new TwoWheelerSpot(1));
        twoWheelerSpots.add(new TwoWheelerSpot(2));
        twoWheelerSpots.add(new TwoWheelerSpot(3));

        // 2. Create manager
        TwoWheelerSpotManager manager =
                new TwoWheelerSpotManager(3);

        // Add spots to manager
        manager.list = twoWheelerSpots;

        // 3. Create entrance
        Entrance entrance = new Entrance(1, manager);

        // 4. Create vehicle
        Vehicle vehicle = new TwoWheeler(101);

        // 5. Find available spot
        ParkingSpot spot = entrance.findSpace();

        if (spot == null) {
            System.out.println("No parking space available");
            return;
        }

        System.out.println("Parking Spot Found: " + spot.id);

        // 6. Book the spot
        entrance.bookSlot(vehicle, spot);

        System.out.println("Vehicle parked successfully");

        // 7. Generate ticket
        Ticket ticket = entrance.generateTicket(vehicle, spot);

        System.out.println("Ticket generated");
        System.out.println("Entry Time: " + ticket.entryTime);
        System.out.println("Vehicle ID: " + ticket.vehicle.id);
        System.out.println("Parking Spot: " + ticket.parkingSpot.id);

        // 8. Create Exit
        Exit exit = new Exit(manager);

        // 9. Exit vehicle
        exit.exitVehicle(ticket);
    }
}
