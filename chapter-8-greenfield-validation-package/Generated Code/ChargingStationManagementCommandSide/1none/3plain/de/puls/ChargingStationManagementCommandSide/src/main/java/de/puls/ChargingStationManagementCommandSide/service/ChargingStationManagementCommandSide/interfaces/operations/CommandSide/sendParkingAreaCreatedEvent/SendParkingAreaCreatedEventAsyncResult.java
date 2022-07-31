package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaCreatedEvent;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaCreatedEvent;

public class SendParkingAreaCreatedEventAsyncResult {

    private ParkingAreaCreatedEvent event;

    public ParkingAreaCreatedEvent getEvent() {
        return event;
    }

    public void setEvent(ParkingAreaCreatedEvent event) {
        this.event = event;
    }
}
