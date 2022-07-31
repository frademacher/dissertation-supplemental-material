package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ChargerSpeed;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.Location;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.TimePeriods;
import java.util.Date;

public interface ParkingAreaGen {

    Long getId();

    void setId(Long id);

    Long getOwnerId();

    void setOwnerId(Long ownerId);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Location getLocation();

    void setLocation(Location location);

    Integer getParkingSpaceCount();

    void setParkingSpaceCount(Integer parkingSpaceCount);

    TimePeriods getAvailability();

    void setAvailability(TimePeriods availability);

    Float getPricePerHour();

    void setPricePerHour(Float pricePerHour);

    Float getPricePerKwh();

    void setPricePerKwh(Float pricePerKwh);

    ChargerSpeed getChargerSpeed();

    void setChargerSpeed(ChargerSpeed chargerSpeed);

    String getPlugType();

    void setPlugType(String plugType);

    Boolean getActivated();

    void setActivated(Boolean activated);

    Boolean getBlocked();

    void setBlocked(Boolean blocked);

    Boolean getOffered();

    void setOffered(Boolean offered);

    Date getCreatedDate();

    Date getLastModifiedDate();

    void setLastModifiedDate(Date lastModifiedDate);

    ParkingAreaInformation toParkingAreaInformation();
}
