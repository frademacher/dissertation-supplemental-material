package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.fhdo.lemma.ddd.structure.DddFactory;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaInformation;

public class ParkingAreaFactory implements DddFactory {

    public ParkingAreaFactory() {
    }

    static public ParkingArea fromParkingAreaInformation(ParkingAreaInformation info) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
