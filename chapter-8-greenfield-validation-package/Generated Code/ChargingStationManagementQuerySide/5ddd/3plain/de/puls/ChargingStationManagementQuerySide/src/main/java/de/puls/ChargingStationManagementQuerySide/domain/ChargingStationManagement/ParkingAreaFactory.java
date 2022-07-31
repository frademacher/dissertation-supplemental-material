package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.fhdo.lemma.ddd.structure.DddFactory;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;

public class ParkingAreaFactory implements DddFactory {

    public ParkingAreaFactory() {
    }

    static public ParkingArea fromParkingAreaInformation(ParkingAreaInformation info) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
