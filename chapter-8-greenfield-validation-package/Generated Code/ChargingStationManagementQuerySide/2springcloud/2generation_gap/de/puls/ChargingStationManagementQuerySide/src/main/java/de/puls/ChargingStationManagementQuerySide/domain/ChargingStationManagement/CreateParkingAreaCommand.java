package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen.CreateParkingAreaCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CreateParkingAreaCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CreateParkingAreaCommand extends CreateParkingAreaCommandGenImpl {

    public CreateParkingAreaCommand() {
        super();
    }

    public CreateParkingAreaCommand(ParkingAreaInformation info) {
        super(info);
    }
}
