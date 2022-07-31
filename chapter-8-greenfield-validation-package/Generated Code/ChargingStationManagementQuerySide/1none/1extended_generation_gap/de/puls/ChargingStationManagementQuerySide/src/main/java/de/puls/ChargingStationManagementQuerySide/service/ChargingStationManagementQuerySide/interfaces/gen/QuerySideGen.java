package de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces.gen;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.Location;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaCreatedEvent;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaDeletedEvent;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformationList;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaUpdatedEvent;
import de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces.operations.QuerySide.getParkingArea.ParkingAreaNotFoundException;
import de.puls.ChargingStationManagementQuerySide.service.ChargingStationManagementQuerySide.interfaces.operations.QuerySide.getParkingAreas.NoParkingAreasFoundException;

public interface QuerySideGen {

    ParkingAreaInformation getParkingArea(Long id) throws ParkingAreaNotFoundException;

    ParkingAreaInformationList getParkingAreas(Location northEastBound, Location southWestBound) throws NoParkingAreasFoundException;

    void receiveParkingAreaCreatedEvent(ParkingAreaCreatedEvent event);

    void receiveParkingAreaUpdatedEvent(ParkingAreaUpdatedEvent event);

    void receiveParkingAreaDeletedEvent(ParkingAreaDeletedEvent event);
}