package com.spencer.test.eight.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceRecordService {
	
	@Autowired
	private MaintenanceRecordRepository maintenanceRecordRepository;
	
	public MaintenanceRecord insert(MaintenanceRecord maintenanceRecord) {
		return maintenanceRecordRepository.insert(maintenanceRecord);
	}
	
	public List<MaintenanceRecord> getRecords() {
		return maintenanceRecordRepository.findAll();
	}
	
	public List<MaintenanceRecord> getByType(String type) {
		return maintenanceRecordRepository.findByType(type);
	}
	
	public MaintenanceRecord update(MaintenanceRecord maintenanceRecord) {
		return maintenanceRecordRepository.save(maintenanceRecord);
	}
	
	public void delete(MaintenanceRecord maintenanceRecord) {
		maintenanceRecordRepository.delete(maintenanceRecord);
	}
}
