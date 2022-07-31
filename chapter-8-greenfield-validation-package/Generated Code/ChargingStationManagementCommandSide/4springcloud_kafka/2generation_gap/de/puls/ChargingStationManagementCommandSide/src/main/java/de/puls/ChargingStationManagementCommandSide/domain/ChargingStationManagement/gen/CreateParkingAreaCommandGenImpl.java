package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaInformation;

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
