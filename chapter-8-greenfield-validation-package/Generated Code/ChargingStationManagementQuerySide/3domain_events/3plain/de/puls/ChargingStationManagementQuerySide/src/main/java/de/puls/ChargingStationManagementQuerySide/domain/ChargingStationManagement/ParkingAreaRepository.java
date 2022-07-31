package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ParkingAreaRepository extends CrudRepository<ParkingArea, Long> {
}
