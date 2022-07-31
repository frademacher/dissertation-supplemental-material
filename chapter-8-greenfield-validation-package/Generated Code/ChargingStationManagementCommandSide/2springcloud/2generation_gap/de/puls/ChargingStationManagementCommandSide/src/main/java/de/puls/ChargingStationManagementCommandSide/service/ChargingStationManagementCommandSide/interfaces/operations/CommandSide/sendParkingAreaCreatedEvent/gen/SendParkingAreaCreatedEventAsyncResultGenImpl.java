package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaCreatedEvent.gen;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaCreatedEvent;

public abstract class SendParkingAreaCreatedEventAsyncResultGenImpl implements SendParkingAreaCreatedEventAsyncResultGen {

    protected ParkingAreaCreatedEvent event;

    @Override
    public ParkingAreaCreatedEvent getEvent() {
        return event;
    }

    @Override
    public void setEvent(ParkingAreaCreatedEvent event) {
        this.event = event;
    }
}
