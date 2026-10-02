package parking_lot.parking_spot_manager;
import parking_lot.parking_slot.ParkingSpot;
import parking_lot.vehicle.Vehicle;

import java.util.*;
public class ParkingSpotManager {
    public List<ParkingSpot> list;
    public int capacity;
    public ParkingSpotManager(List<ParkingSpot> list ,int capacity){
        this.capacity = capacity;
        this.list = list;
    }
    //findspot for parking
    public ParkingSpot findParkingSpot(){
        for (ParkingSpot spot : list) {
            if(spot.isEmpty){
                return spot;
            }
        }
        return null;
    }

    //adding more capacity
    public void addParkingSpace(int count){
        capacity += count;
    }
    //removing capacity
    public void removeParkingSpace(int count){
        capacity = Math.max(list.size(), capacity - count);
    }
    //parking vehicle
    public void parkingVehicle(Vehicle vehicle){
        ParkingSpot spot = findParkingSpot();

        if(spot != null){
            spot.parkingVehicle(vehicle);
        }else{
            System.out.println("No parking spot available");
        }
    }
    //removing vehicle if parked
    public void removeVehicle(Vehicle vehicle){
        for(ParkingSpot spot : list){
            if(spot.vehicle == vehicle){
                spot.removeVehicle();
                return;
            }
        }
        System.out.println("Vehicle not found");
    };
}
