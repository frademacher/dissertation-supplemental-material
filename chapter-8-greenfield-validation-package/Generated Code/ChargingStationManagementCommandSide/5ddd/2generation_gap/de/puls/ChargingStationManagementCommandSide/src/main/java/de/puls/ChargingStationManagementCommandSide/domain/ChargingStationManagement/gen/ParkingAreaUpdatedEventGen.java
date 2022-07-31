package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaInformation;

public interface ParkingAreaUpdatedEventGen {

    long getParkingAreaId();

    void setParkingAreaId(long parkingAreaId);

    ParkingAreaInformation getInfo();
}
