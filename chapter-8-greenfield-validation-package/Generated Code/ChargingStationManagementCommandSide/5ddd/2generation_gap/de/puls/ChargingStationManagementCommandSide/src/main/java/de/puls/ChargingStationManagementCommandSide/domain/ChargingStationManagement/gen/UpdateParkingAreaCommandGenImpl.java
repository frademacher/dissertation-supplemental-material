package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaInformation;

public abstract class UpdateParkingAreaCommandGenImpl implements DddValueObject, UpdateParkingAreaCommandGen {

    public UpdateParkingAreaCommandGenImpl() {
    }

    protected ParkingAreaInformation info;

    @Override
    public ParkingAreaInformation getInfo() {
        return info;
    }

    public UpdateParkingAreaCommandGenImpl(ParkingAreaInformation info) {
        this.info = info;
    }
}
