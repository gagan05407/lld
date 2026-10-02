package parking_lot.parking_slot;
import parking_lot.vehicle.Vehicle;
public abstract class ParkingSpot {
    public int id;
    public boolean isEmpty = true;
    public int price;
    public Vehicle vehicle;

    public ParkingSpot(int id, int price){
        this.id = id;
        this.price =price;
    }
    public void parkingVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        isEmpty= true;
    }

}
