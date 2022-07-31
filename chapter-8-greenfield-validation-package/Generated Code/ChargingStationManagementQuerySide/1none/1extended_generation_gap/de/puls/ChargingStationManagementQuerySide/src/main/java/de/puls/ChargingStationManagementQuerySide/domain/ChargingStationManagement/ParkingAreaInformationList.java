package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.ParkingAreaInformation;
import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen.ParkingAreaInformationListGen;
import java.util.ArrayList;

public class ParkingAreaInformationList extends ArrayList<ParkingAreaInformationList.ParkingAreaInformationListItem> implements ParkingAreaInformationListGen {

    public static class ParkingAreaInformationListItem {

        public ParkingAreaInformationListItem() {
        }

        private ParkingAreaInformation i;

        public ParkingAreaInformation getI() {
            return i;
        }

        public void setI(ParkingAreaInformation i) {
            this.i = i;
        }

        public ParkingAreaInformationListItem(ParkingAreaInformation i) {
            this.i = i;
        }
    }
}
