package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen.ParkingAreaDeletedEventGen;

public class ParkingAreaDeletedEvent implements ParkingAreaDeletedEventGen {

    public ParkingAreaDeletedEvent() {
    }

    private long parkingAreaId;

    @Override
    public long getParkingAreaId() {
        return parkingAreaId;
    }

    @Override
    public void setParkingAreaId(long parkingAreaId) {
        this.parkingAreaId = parkingAreaId;
    }

    public ParkingAreaDeletedEvent(long parkingAreaId) {
        this.parkingAreaId = parkingAreaId;
    }
}
