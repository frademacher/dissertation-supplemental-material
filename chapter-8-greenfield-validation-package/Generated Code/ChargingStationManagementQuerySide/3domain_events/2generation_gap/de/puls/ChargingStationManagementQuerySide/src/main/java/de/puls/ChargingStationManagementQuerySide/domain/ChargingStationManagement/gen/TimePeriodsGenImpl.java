package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.TimePeriod;
import java.util.ArrayList;

public abstract class TimePeriodsGenImpl extends ArrayList<TimePeriodsGenImpl.TimePeriodsItem> implements TimePeriodsGen {

    public static class TimePeriodsItem {

        public TimePeriodsItem() {
        }

        private TimePeriod p;

        public TimePeriod getP() {
            return p;
        }

        public void setP(TimePeriod p) {
            this.p = p;
        }

        public TimePeriodsItem(TimePeriod p) {
            this.p = p;
        }
    }
}
