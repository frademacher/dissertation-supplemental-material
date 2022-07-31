package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ChargerSpeed;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.Location;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.TimePeriods;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "ParkingArea")
public abstract class ParkingAreaGenImpl implements DddAggregate, DddEntity, ParkingAreaGen {

    public ParkingAreaGenImpl() {
    }

    @DddIdentifier()
    @Id()
    protected Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    protected Long ownerId;

    @Override
    public Long getOwnerId() {
        return ownerId;
    }

    @Override
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    protected String description;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @DddPart()
    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    protected Integer parkingSpaceCount;

    @Override
    public Integer getParkingSpaceCount() {
        return parkingSpaceCount;
    }

    @Override
    public void setParkingSpaceCount(Integer parkingSpaceCount) {
        this.parkingSpaceCount = parkingSpaceCount;
    }

    @DddPart()
    protected TimePeriods availability;

    @Override
    public TimePeriods getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(TimePeriods availability) {
        this.availability = availability;
    }

    protected Float pricePerHour;

    @Override
    public Float getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public void setPricePerHour(Float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    protected Float pricePerKwh;

    @Override
    public Float getPricePerKwh() {
        return pricePerKwh;
    }

    @Override
    public void setPricePerKwh(Float pricePerKwh) {
        this.pricePerKwh = pricePerKwh;
    }

    protected ChargerSpeed chargerSpeed;

    @Override
    public ChargerSpeed getChargerSpeed() {
        return chargerSpeed;
    }

    @Override
    public void setChargerSpeed(ChargerSpeed chargerSpeed) {
        this.chargerSpeed = chargerSpeed;
    }

    protected String plugType;

    @Override
    public String getPlugType() {
        return plugType;
    }

    @Override
    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    protected Boolean activated;

    @Override
    public Boolean getActivated() {
        return activated;
    }

    @Override
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    protected Boolean blocked;

    @Override
    public Boolean getBlocked() {
        return blocked;
    }

    @Override
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    protected Boolean offered;

    @Override
    public Boolean getOffered() {
        return offered;
    }

    @Override
    public void setOffered(Boolean offered) {
        this.offered = offered;
    }

    protected Date createdDate;

    @Override
    public Date getCreatedDate() {
        return createdDate;
    }

    protected Date lastModifiedDate;

    @Override
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public ParkingAreaGenImpl(Long id, Long ownerId, String name, String description, Location location, Integer parkingSpaceCount, TimePeriods availability, Float pricePerHour, Float pricePerKwh, ChargerSpeed chargerSpeed, String plugType, Boolean activated, Boolean blocked, Boolean offered, Date createdDate, Date lastModifiedDate) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.description = description;
        this.location = location;
        this.parkingSpaceCount = parkingSpaceCount;
        this.availability = availability;
        this.pricePerHour = pricePerHour;
        this.pricePerKwh = pricePerKwh;
        this.chargerSpeed = chargerSpeed;
        this.plugType = plugType;
        this.activated = activated;
        this.blocked = blocked;
        this.offered = offered;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public ParkingAreaInformation toParkingAreaInformation() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
