package parking_lot.parking_spot_manager;

import java.util.ArrayList;



public class TwoWheelerSpotManager extends ParkingSpotManager {
    public TwoWheelerSpotManager(int capacity){
        super(new ArrayList<>(), capacity); 
    }
}
