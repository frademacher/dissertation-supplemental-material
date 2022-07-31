package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

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
public class ParkingArea implements DddAggregate, DddEntity {

    public ParkingArea() {
    }

    @DddIdentifier()
    @Id()
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long ownerId;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DddPart()
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Integer parkingSpaceCount;

    public Integer getParkingSpaceCount() {
        return parkingSpaceCount;
    }

    public void setParkingSpaceCount(Integer parkingSpaceCount) {
        this.parkingSpaceCount = parkingSpaceCount;
    }

    @DddPart()
    private TimePeriods availability;

    public TimePeriods getAvailability() {
        return availability;
    }

    public void setAvailability(TimePeriods availability) {
        this.availability = availability;
    }

    private Float pricePerHour;

    public Float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    private Float pricePerKwh;

    public Float getPricePerKwh() {
        return pricePerKwh;
    }

    public void setPricePerKwh(Float pricePerKwh) {
        this.pricePerKwh = pricePerKwh;
    }

    private ChargerSpeed chargerSpeed;

    public ChargerSpeed getChargerSpeed() {
        return chargerSpeed;
    }

    public void setChargerSpeed(ChargerSpeed chargerSpeed) {
        this.chargerSpeed = chargerSpeed;
    }

    private String plugType;

    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    private Boolean activated;

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    private Boolean blocked;

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    private Boolean offered;

    public Boolean getOffered() {
        return offered;
    }

    public void setOffered(Boolean offered) {
        this.offered = offered;
    }

    private Date createdDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    private Date lastModifiedDate;

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public ParkingArea(Long id, Long ownerId, String name, String description, Location location, Integer parkingSpaceCount, TimePeriods availability, Float pricePerHour, Float pricePerKwh, ChargerSpeed chargerSpeed, String plugType, Boolean activated, Boolean blocked, Boolean offered, Date createdDate, Date lastModifiedDate) {
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

    public ParkingAreaInformation toParkingAreaInformation() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
