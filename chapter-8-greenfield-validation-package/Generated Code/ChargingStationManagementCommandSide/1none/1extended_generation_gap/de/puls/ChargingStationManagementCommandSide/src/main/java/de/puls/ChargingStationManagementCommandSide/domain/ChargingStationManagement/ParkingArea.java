package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ChargerSpeed;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.Location;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.TimePeriods;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen.ParkingAreaGen;
import java.util.Date;

public class ParkingArea implements ParkingAreaGen {

    public ParkingArea() {
    }

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    private Long ownerId;

    @Override
    public Long getOwnerId() {
        return ownerId;
    }

    @Override
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String description;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    private Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    private Integer parkingSpaceCount;

    @Override
    public Integer getParkingSpaceCount() {
        return parkingSpaceCount;
    }

    @Override
    public void setParkingSpaceCount(Integer parkingSpaceCount) {
        this.parkingSpaceCount = parkingSpaceCount;
    }

    private TimePeriods availability;

    @Override
    public TimePeriods getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(TimePeriods availability) {
        this.availability = availability;
    }

    private Float pricePerHour;

    @Override
    public Float getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public void setPricePerHour(Float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    private Float pricePerKwh;

    @Override
    public Float getPricePerKwh() {
        return pricePerKwh;
    }

    @Override
    public void setPricePerKwh(Float pricePerKwh) {
        this.pricePerKwh = pricePerKwh;
    }

    private ChargerSpeed chargerSpeed;

    @Override
    public ChargerSpeed getChargerSpeed() {
        return chargerSpeed;
    }

    @Override
    public void setChargerSpeed(ChargerSpeed chargerSpeed) {
        this.chargerSpeed = chargerSpeed;
    }

    private String plugType;

    @Override
    public String getPlugType() {
        return plugType;
    }

    @Override
    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    private Boolean activated;

    @Override
    public Boolean getActivated() {
        return activated;
    }

    @Override
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    private Boolean blocked;

    @Override
    public Boolean getBlocked() {
        return blocked;
    }

    @Override
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    private Boolean offered;

    @Override
    public Boolean getOffered() {
        return offered;
    }

    @Override
    public void setOffered(Boolean offered) {
        this.offered = offered;
    }

    private Date createdDate;

    @Override
    public Date getCreatedDate() {
        return createdDate;
    }

    private Date lastModifiedDate;

    @Override
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
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

    @Override
    public ParkingAreaInformation toParkingAreaInformation() {
        /* FIXME If you safely want to implement this method, create an extension interface called 
ParkingAreaExt in the same folder as this class file and run the code 
generator again. Otherwise, this file and all your changes to it will probably get overwritten 
the next time the code generator is executed. */
        throw new UnsupportedOperationException("Not implemented");
    }
}
