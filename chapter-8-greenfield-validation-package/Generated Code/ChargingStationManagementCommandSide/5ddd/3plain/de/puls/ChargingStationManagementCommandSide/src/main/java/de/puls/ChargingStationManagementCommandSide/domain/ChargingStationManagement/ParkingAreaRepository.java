package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ParkingAreaRepository extends CrudRepository<ParkingArea, Long>, DddRepository {
}
