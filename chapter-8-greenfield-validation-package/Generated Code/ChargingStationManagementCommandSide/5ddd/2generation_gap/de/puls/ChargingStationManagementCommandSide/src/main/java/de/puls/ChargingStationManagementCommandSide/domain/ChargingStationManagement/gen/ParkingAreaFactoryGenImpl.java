package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddFactory;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaInformation;

public abstract class ParkingAreaFactoryGenImpl implements DddFactory, ParkingAreaFactoryGen {

    public ParkingAreaFactoryGenImpl() {
    }

    static public ParkingArea fromParkingAreaInformation(ParkingAreaInformation info) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
