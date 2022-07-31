package de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces;

import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.CreateParkingAreaCommand;
import de.puls.ChargingStationManagementCommandSide.domain.ChargingStationManagement.UpdateParkingAreaCommand;
import de.puls.ChargingStationManagementCommandSide.service.ChargingStationManagementCommandSide.interfaces.gen.CommandSideGen;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
@RequestMapping(value = {"/resources/v1"})
public class CommandSide implements CommandSideGen {

    @ApiOperation(value = "API endpoint for creating a parking area")
    @PutMapping(value = "/parkingarea")
    @Override
    public void createParkingArea(@ApiParam(value = "Command object to specify the values of the new parking area", required = true) @RequestBody() @Valid() CreateParkingAreaCommand command) {
        checkRequiredParametersOfCreateParkingArea(command);
    }

    private void checkRequiredParametersOfCreateParkingArea(CreateParkingAreaCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }

    @ApiOperation(value = "API endpoint for updating a parking area")
    @PostMapping(value = "/parkingarea/{id}")
    @Override
    public void updateParkingArea(@ApiParam(value = "Identifier of the parking area to be updated", required = true) @PathVariable() Long id, @ApiParam(value = "Command object to specify the values of the updated parking area", required = true) @RequestBody() @Valid() UpdateParkingAreaCommand command) {
        checkRequiredParametersOfUpdateParkingArea(id, command);
    }

    private void checkRequiredParametersOfUpdateParkingArea(Long id, UpdateParkingAreaCommand command) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }

    @ApiOperation(value = "API endpoint for deleting a parking area")
    @DeleteMapping(value = "/parkingarea/{id}")
    @Override
    public void deleteParkingArea(@ApiParam(value = "Identifier of the parking area to be deleted", required = true) @PathVariable() Long id) {
        checkRequiredParametersOfDeleteParkingArea(id);
    }

    private void checkRequiredParametersOfDeleteParkingArea(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @Override
    public void sendParkingAreaCreatedEvent() {
        /*TODO Method should asynchronously return one or more instances of SendParkingAreaCreatedEventAsyncResult
 FIXME If you safely want to implement this method, create an extension interface called 
CommandSideExt in the same folder as this class file and run the code 
generator again. Otherwise, this file and all your changes to it will probably get overwritten 
the next time the code generator is executed. */
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void sendParkingAreaUpdatedEvent() {
        /*TODO Method should asynchronously return one or more instances of SendParkingAreaUpdatedEventAsyncResult
 FIXME If you safely want to implement this method, create an extension interface called 
CommandSideExt in the same folder as this class file and run the code 
generator again. Otherwise, this file and all your changes to it will probably get overwritten 
the next time the code generator is executed. */
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void sendParkingAreaDeletedEvent() {
        /*TODO Method should asynchronously return one or more instances of SendParkingAreaDeletedEventAsyncResult
 FIXME If you safely want to implement this method, create an extension interface called 
CommandSideExt in the same folder as this class file and run the code 
generator again. Otherwise, this file and all your changes to it will probably get overwritten 
the next time the code generator is executed. */
        throw new UnsupportedOperationException("Not implemented");
    }
}
