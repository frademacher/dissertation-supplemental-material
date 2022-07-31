package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.operations.CommandSide.sendParkingAreaUpdatedEvent.gen;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaUpdatedEvent;

public abstract class SendParkingAreaUpdatedEventAsyncResultGenImpl implements SendParkingAreaUpdatedEventAsyncResultGen {

    protected ParkingAreaUpdatedEvent event;

    @Override
    public ParkingAreaUpdatedEvent getEvent() {
        return event;
    }

    @Override
    public void setEvent(ParkingAreaUpdatedEvent event) {
        this.event = event;
    }
}
