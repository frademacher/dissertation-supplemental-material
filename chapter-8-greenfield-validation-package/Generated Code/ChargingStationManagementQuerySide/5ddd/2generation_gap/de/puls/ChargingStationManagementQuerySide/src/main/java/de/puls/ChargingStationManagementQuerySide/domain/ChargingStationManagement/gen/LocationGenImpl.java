package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class LocationGenImpl implements DddValueObject, LocationGen {

    public LocationGenImpl() {
    }

    protected double latitude;

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    protected double longitude;

    @Override
    public double getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LocationGenImpl(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
