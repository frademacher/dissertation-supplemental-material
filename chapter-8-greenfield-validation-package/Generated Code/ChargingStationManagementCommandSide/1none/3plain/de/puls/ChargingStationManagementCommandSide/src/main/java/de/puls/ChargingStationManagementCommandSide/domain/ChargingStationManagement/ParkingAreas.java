package de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingArea;
import java.util.ArrayList;

public class ParkingAreas extends ArrayList<ParkingAreas.ParkingAreasItem> {

    public static class ParkingAreasItem {

        public ParkingAreasItem() {
        }

        private ParkingArea p;

        public ParkingArea getP() {
            return p;
        }

        public void setP(ParkingArea p) {
            this.p = p;
        }

        public ParkingAreasItem(ParkingArea p) {
            this.p = p;
        }
    }
}
