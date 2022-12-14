package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaCreatedEvent;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaCreatedEvent;
import de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaCreatedEvent.gen.SendParkingAreaCreatedEventAsyncResultGen;

public class SendParkingAreaCreatedEventAsyncResult implements SendParkingAreaCreatedEventAsyncResultGen {

    private ParkingAreaCreatedEvent event;

    @Override
    public ParkingAreaCreatedEvent getEvent() {
        return event;
    }

    @Override
    public void setEvent(ParkingAreaCreatedEvent event) {
        this.event = event;
    }
}
