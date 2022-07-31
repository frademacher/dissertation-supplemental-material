package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreas;

public class ParkingAreaRepository {

    public ParkingAreaRepository() {
    }

    private ParkingAreas managedParkingAreas;

    public ParkingAreas getManagedParkingAreas() {
        return managedParkingAreas;
    }

    public void setManagedParkingAreas(ParkingAreas managedParkingAreas) {
        this.managedParkingAreas = managedParkingAreas;
    }

    public ParkingAreaRepository(ParkingAreas managedParkingAreas) {
        this.managedParkingAreas = managedParkingAreas;
    }
}
