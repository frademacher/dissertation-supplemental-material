package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.gen.LocationGen;

public class Location implements LocationGen {

    public Location() {
    }

    private double latitude;

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    private double longitude;

    @Override
    public double getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
