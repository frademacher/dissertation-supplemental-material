package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.gen;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.CreateParkingAreaCommand;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.UpdateParkingAreaCommand;

public interface CommandSideGen {

    void createParkingArea(CreateParkingAreaCommand command);

    void updateParkingArea(Long id, UpdateParkingAreaCommand command);

    void deleteParkingArea(Long id);
}
