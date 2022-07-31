package de.puls.ChargingStationManagementCommandSide.domain.avro.gen;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaCreatedEvent;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaDeletedEvent;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.ParkingAreaUpdatedEvent;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecordBuilder;

public abstract class AvroConvertersGenImpl implements AvroConvertersGen {

    public static GenericRecordBuilder getRecordBuilder(ParkingAreaCreatedEvent parkingAreaCreatedEvent) throws IOException {
        InputStream schemaStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream("ParkingAreaCreatedEvent.avsc");
        Schema schema = new Schema.Parser().parse(schemaStream);
        GenericRecordBuilder builder = new GenericRecordBuilder(schema);
        builder.set("parkingAreaId", parkingAreaCreatedEvent.getParkingAreaId());
        return builder;
    }

    public static ParkingAreaCreatedEvent getParkingAreaCreatedEventObjectFromRecord(GenericData.Record parkingAreaCreatedEventRecord) {
        ParkingAreaCreatedEvent parkingAreaCreatedEvent = new ParkingAreaCreatedEvent();
        try {
            parkingAreaCreatedEvent.setParkingAreaId((long) parkingAreaCreatedEventRecord.get("parkingAreaId"));
        } catch (AvroRuntimeException ex) {
        }
        return parkingAreaCreatedEvent;
    }

    public static GenericRecordBuilder getRecordBuilder(ParkingAreaUpdatedEvent parkingAreaUpdatedEvent) throws IOException {
        InputStream schemaStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream("ParkingAreaUpdatedEvent.avsc");
        Schema schema = new Schema.Parser().parse(schemaStream);
        GenericRecordBuilder builder = new GenericRecordBuilder(schema);
        builder.set("parkingAreaId", parkingAreaUpdatedEvent.getParkingAreaId());
        return builder;
    }

    public static ParkingAreaUpdatedEvent getParkingAreaUpdatedEventObjectFromRecord(GenericData.Record parkingAreaUpdatedEventRecord) {
        ParkingAreaUpdatedEvent parkingAreaUpdatedEvent = new ParkingAreaUpdatedEvent();
        try {
            parkingAreaUpdatedEvent.setParkingAreaId((long) parkingAreaUpdatedEventRecord.get("parkingAreaId"));
        } catch (AvroRuntimeException ex) {
        }
        return parkingAreaUpdatedEvent;
    }

    public static GenericRecordBuilder getRecordBuilder(ParkingAreaDeletedEvent parkingAreaDeletedEvent) throws IOException {
        InputStream schemaStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream("ParkingAreaDeletedEvent.avsc");
        Schema schema = new Schema.Parser().parse(schemaStream);
        GenericRecordBuilder builder = new GenericRecordBuilder(schema);
        builder.set("parkingAreaId", parkingAreaDeletedEvent.getParkingAreaId());
        return builder;
    }

    public static ParkingAreaDeletedEvent getParkingAreaDeletedEventObjectFromRecord(GenericData.Record parkingAreaDeletedEventRecord) {
        ParkingAreaDeletedEvent parkingAreaDeletedEvent = new ParkingAreaDeletedEvent();
        try {
            parkingAreaDeletedEvent.setParkingAreaId((long) parkingAreaDeletedEventRecord.get("parkingAreaId"));
        } catch (AvroRuntimeException ex) {
        }
        return parkingAreaDeletedEvent;
    }
}
