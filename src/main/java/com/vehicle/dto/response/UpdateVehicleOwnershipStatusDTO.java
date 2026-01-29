package com.vehicle.dto.response;

import com.vehicle.enums.OwnershipStatus;

public class UpdateVehicleOwnershipStatusDTO {

	 private OwnershipStatus status;

	    public OwnershipStatus getStatus() {
	        return status;
	    }

	    public void setStatus(OwnershipStatus status) {
	        this.status = status;
	    }
	
}
