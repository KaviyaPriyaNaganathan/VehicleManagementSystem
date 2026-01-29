package com.vehicle.dto.response;

import com.vehicle.enums.ServiceStatus;

public class UpdateServiceRecordStatus {

	private ServiceStatus status;

    public UpdateServiceRecordStatus() {}

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }
	
}
