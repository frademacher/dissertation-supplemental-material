package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;

public abstract class CreateParkingAreaCommandGenImpl implements CreateParkingAreaCommandGen {

    public CreateParkingAreaCommandGenImpl() {
    }

    protected ParkingAreaInformation info;

    @Override
    public ParkingAreaInformation getInfo() {
        return info;
    }

    public CreateParkingAreaCommandGenImpl(ParkingAreaInformation info) {
        this.info = info;
    }
}
