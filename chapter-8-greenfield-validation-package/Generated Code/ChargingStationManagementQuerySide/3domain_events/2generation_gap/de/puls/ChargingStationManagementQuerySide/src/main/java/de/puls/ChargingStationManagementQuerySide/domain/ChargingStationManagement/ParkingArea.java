package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ChargerSpeed;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.Location;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.TimePeriods;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen.ParkingAreaGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingAreaGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkingArea extends ParkingAreaGenImpl {

    @Override
    public ParkingAreaInformation toParkingAreaInformation() {
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.toParkingAreaInformation();
    }

    public ParkingArea() {
        super();
    }

    public ParkingArea(Long id, Long ownerId, String name, String description, Location location, Integer parkingSpaceCount, TimePeriods availability, Float pricePerHour, Float pricePerKwh, ChargerSpeed chargerSpeed, String plugType, Boolean activated, Boolean blocked, Boolean offered, Date createdDate, Date lastModifiedDate) {
        super(id, ownerId, name, description, location, parkingSpaceCount, availability, pricePerHour, pricePerKwh, chargerSpeed, plugType, activated, blocked, offered, createdDate, lastModifiedDate);
    }
}
