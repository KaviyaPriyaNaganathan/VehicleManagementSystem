package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleSaleRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.dto.response.VehicleSaleResponseDTO;
import com.vehicle.mapper.VehicleSaleMapper;
import com.vehicle.models.Payment;
import com.vehicle.models.Stock;
import com.vehicle.models.Vehicle;
import com.vehicle.models.VehicleSale;
import com.vehicle.repository.PaymentRepository;
import com.vehicle.repository.StockRepository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.repository.VehicleSaleRepository;
import com.vehicle.service.VehicleSaleService;

import jakarta.transaction.Transactional;

@Service
public class VehicleSaleServiceImpl implements VehicleSaleService{

	 private final VehicleSaleRepository vehicleSaleRepository;
	    private final VehicleRespository vehicleRepository;
	    private final StockRepository stockRepository;
	    private final PaymentRepository paymentRepository;
		
	    @Autowired
	    public VehicleSaleServiceImpl(VehicleSaleRepository vehicleSaleRepository, VehicleRespository vehicleRepository,
				StockRepository stockRepository, PaymentRepository paymentRepository) {
			super();
			this.vehicleSaleRepository = vehicleSaleRepository;
			this.vehicleRepository = vehicleRepository;
			this.stockRepository = stockRepository;
			this.paymentRepository = paymentRepository;
		}

	
	    
	    @Transactional
	    @Override
	    public VehicleSaleResponseDTO createVehicleSale(VehicleSaleRequestDTO sale) {

	        Vehicle vehicle = vehicleRepository.findById(sale.getVehicleId())
	                .orElseThrow(() -> new RuntimeException("Vehicle not found with id " + sale.getVehicleId()));

	        Payment payment = null;
	        if (sale.getPaymentId() != null) {
	            payment = paymentRepository.findById(sale.getPaymentId())
	                    .orElseThrow(() -> new RuntimeException("Payment not found with id " + sale.getPaymentId()));
	        }

	        Stock stock = stockRepository.findByVehicle(vehicle)
	                .orElseThrow(() -> new RuntimeException("Stock not found for vehicle " + vehicle.getId()));

	        if (stock.getQuantity() < sale.getQuantity()) 
	        {
	            throw new RuntimeException("Insufficient stock");
	        }

	        stock.setQuantity(stock.getQuantity() - sale.getQuantity());
	        stockRepository.save(stock);

	        VehicleSale entitySale =VehicleSaleMapper.toEntity(sale, vehicle, payment);

	        VehicleSale saved = vehicleSaleRepository.save(entitySale);

	        return VehicleSaleMapper.toResponse(saved);
	    }

	    

		@Override
		public List<VehicleSaleResponseDTO> getAllVehicleSales() {
			// TODO Auto-generated method stub

			return vehicleSaleRepository.findAll()
					.stream()
	                .map(VehicleSaleMapper::toResponse)
	                .toList();
		}

		@Override
		public VehicleSaleResponseDTO getVehicleSaleById(Long id) {
			// TODO Auto-generated method stub
			  VehicleSale sale = vehicleSaleRepository.findById(id)
		                .orElseThrow(() -> new RuntimeException("Vehicle sale not found with id " + id));
		        return VehicleSaleMapper.toResponse(sale);
		}

		@Override
		public List<StockResponseDTO> searchVehiclesByName(String name) {
		   
			List<Stock> stocks = stockRepository.findAll()
		            .stream()
		            .filter(stock -> {
		                String brand = stock.getVehicle().getBrand() != null ? stock.getVehicle().getBrand().toLowerCase() : "";
		                String model = stock.getVehicle().getModel() != null ? stock.getVehicle().getModel().toLowerCase() : "";
		                String search = name.toLowerCase();
		                return brand.contains(search) || model.contains(search);
		            })
		            .toList();

		    return stocks.stream().map(stock -> {
		       
		    	StockResponseDTO dto = new StockResponseDTO();
		        
		    	dto.setId(stock.getId());
		        dto.setVehicleId(stock.getVehicle().getId());
		        dto.setVehicle(stock.getVehicle()); 
		        dto.setQuantity(stock.getQuantity());
		        dto.setAvailable(stock.getAvailable());
		        dto.setLocation(stock.getLocation());
		        dto.setAddedDate(stock.getAddedDate());
		        dto.setUnitPrice(stock.getUnitPrice());
		        dto.setTotalPrice(stock.getTotalPrice());
		        dto.setCurrency(stock.getCurrency());
		        dto.setPaymentStatus(stock.getPaymentStatus());
		        dto.setLastPaymentDate(stock.getLastPaymentDate());
		        
		        return dto;
		    }).toList();
		}

	        
	    
	
}
