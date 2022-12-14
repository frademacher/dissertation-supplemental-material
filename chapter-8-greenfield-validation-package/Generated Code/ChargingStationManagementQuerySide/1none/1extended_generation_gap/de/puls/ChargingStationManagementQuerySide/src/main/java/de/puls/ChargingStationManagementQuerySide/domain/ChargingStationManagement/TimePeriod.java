package de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement;

import de.puls.ChargingStationManagementQuerySide.domain.ChargingStationManagement.gen.TimePeriodGen;
import java.util.Date;

public class TimePeriod implements TimePeriodGen {

    public TimePeriod() {
    }

    private Date start;

    @Override
    public Date getStart() {
        return start;
    }

    @Override
    public void setStart(Date start) {
        this.start = start;
    }

    private Date end;

    @Override
    public Date getEnd() {
        return end;
    }

    @Override
    public void setEnd(Date end) {
        this.end = end;
    }

    public TimePeriod(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
}
