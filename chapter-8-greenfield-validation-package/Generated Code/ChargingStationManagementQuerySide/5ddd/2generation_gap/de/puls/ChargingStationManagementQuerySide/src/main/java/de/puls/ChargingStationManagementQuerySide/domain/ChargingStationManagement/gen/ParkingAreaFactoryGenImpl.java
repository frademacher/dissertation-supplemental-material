package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddFactory;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;

public abstract class ParkingAreaFactoryGenImpl implements DddFactory, ParkingAreaFactoryGen {

    public ParkingAreaFactoryGenImpl() {
    }

    static public ParkingArea fromParkingAreaInformation(ParkingAreaInformation info) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
