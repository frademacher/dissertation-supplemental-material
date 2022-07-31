package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaUpdatedEvent;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaUpdatedEvent;

public class SendParkingAreaUpdatedEventAsyncResult {

    private ParkingAreaUpdatedEvent event;

    public ParkingAreaUpdatedEvent getEvent() {
        return event;
    }

    public void setEvent(ParkingAreaUpdatedEvent event) {
        this.event = event;
    }
}
