package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingArea;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen.ParkingAreasGen;
import java.util.ArrayList;

public class ParkingAreas extends ArrayList<ParkingAreas.ParkingAreasItem> implements ParkingAreasGen {

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
