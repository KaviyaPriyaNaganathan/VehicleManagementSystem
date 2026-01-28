package com.vehicle.mapper;


import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;
import com.vehicle.models.ServiceRecord;
import com.vehicle.models.User;
import com.vehicle.models.Vehicle;

public class ServiceRecordMapper {

    public static ServiceRecord toEntity(
            ServiceRecordRequestDTO dto,
            Vehicle vehicle,
            User technician) {

        ServiceRecord record = new ServiceRecord();
        record.setVehicle(vehicle);
        record.setTechnician(technician);
        record.setServiceDate(dto.getServiceDate());
        record.setStatus(dto.getStatus());
        record.setDescription(dto.getDescription());
        record.setServiceCost(dto.getServiceCost());
        record.setCurrency(dto.getCurrency());
        return record;
    }

    public static ServiceRecordResponseDTO toResponse(ServiceRecord entity) {

        ServiceRecordResponseDTO response = new ServiceRecordResponseDTO();
        response.setId(entity.getId());
        response.setVehicleId(entity.getVehicle().getId());
        response.setTechnicianId(entity.getTechnician().getId());
        response.setServiceDate(entity.getServiceDate());
        response.setStatus(entity.getStatus());
        response.setDescription(entity.getDescription());
        response.setServiceCost(entity.getServiceCost());
        response.setCurrency(entity.getCurrency());

        if (entity.getPayment() != null) {
            response.setPaymentId(entity.getPayment().getId());
        }

        return response;
    }
}
