package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaDeletedEvent;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaDeletedEvent;

public class SendParkingAreaDeletedEventAsyncResult {

    private ParkingAreaDeletedEvent event;

    public ParkingAreaDeletedEvent getEvent() {
        return event;
    }

    public void setEvent(ParkingAreaDeletedEvent event) {
        this.event = event;
    }
}
