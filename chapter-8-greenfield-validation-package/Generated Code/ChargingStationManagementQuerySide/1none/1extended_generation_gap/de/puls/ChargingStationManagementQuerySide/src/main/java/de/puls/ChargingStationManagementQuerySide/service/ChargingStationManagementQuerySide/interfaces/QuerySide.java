package de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.Location;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaCreatedEvent;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaDeletedEvent;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformationList;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaUpdatedEvent;
import de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces.gen.QuerySideGen;
import de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces.operations.QuerySide.getParkingArea.ParkingAreaNotFoundException;
import de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces.operations.QuerySide.getParkingAreas.NoParkingAreasFoundException;

public class QuerySide implements QuerySideGen {

    @Override
    public ParkingAreaInformation getParkingArea(Long id) throws ParkingAreaNotFoundException {
        checkRequiredParametersOfGetParkingArea(id);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfGetParkingArea(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @Override
    public ParkingAreaInformationList getParkingAreas(Location northEastBound, Location southWestBound) throws NoParkingAreasFoundException {
        checkRequiredParametersOfGetParkingAreas(northEastBound, southWestBound);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfGetParkingAreas(Location northEastBound, Location southWestBound) {
        if (northEastBound == null)
            throw new IllegalArgumentException("Required parameter \"northEastBound\" must not be null");
        if (southWestBound == null)
            throw new IllegalArgumentException("Required parameter \"southWestBound\" must not be null");
    }

    @Override
    public void receiveParkingAreaCreatedEvent(ParkingAreaCreatedEvent event) {
        checkRequiredAsyncParametersOfReceiveParkingAreaCreatedEvent(event);
    }

    private void checkRequiredAsyncParametersOfReceiveParkingAreaCreatedEvent(ParkingAreaCreatedEvent event) {
        if (event == null)
            throw new IllegalArgumentException("Required parameter \"event\" must not be null");
    }

    @Override
    public void receiveParkingAreaUpdatedEvent(ParkingAreaUpdatedEvent event) {
        checkRequiredAsyncParametersOfReceiveParkingAreaUpdatedEvent(event);
    }

    private void checkRequiredAsyncParametersOfReceiveParkingAreaUpdatedEvent(ParkingAreaUpdatedEvent event) {
        if (event == null)
            throw new IllegalArgumentException("Required parameter \"event\" must not be null");
    }

    @Override
    public void receiveParkingAreaDeletedEvent(ParkingAreaDeletedEvent event) {
        checkRequiredAsyncParametersOfReceiveParkingAreaDeletedEvent(event);
    }

    private void checkRequiredAsyncParametersOfReceiveParkingAreaDeletedEvent(ParkingAreaDeletedEvent event) {
        if (event == null)
            throw new IllegalArgumentException("Required parameter \"event\" must not be null");
    }
}
