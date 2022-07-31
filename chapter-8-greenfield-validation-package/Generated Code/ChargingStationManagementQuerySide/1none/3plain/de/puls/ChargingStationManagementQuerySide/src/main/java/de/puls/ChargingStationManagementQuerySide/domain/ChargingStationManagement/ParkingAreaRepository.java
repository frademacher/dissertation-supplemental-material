package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreas;

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
