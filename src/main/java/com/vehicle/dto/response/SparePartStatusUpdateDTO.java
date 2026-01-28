package com.vehicle.dto.response;

import com.vehicle.enums.SparePartStatus;

public class SparePartStatusUpdateDTO {

	
	private SparePartStatus status;

    public SparePartStatus getStatus() {
        return status;
    }

    public void setStatus(SparePartStatus status) {
        this.status = status;
    }
}
