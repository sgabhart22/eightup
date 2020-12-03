package com.spencer.test.eight.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaintenanceRecordRepository extends MongoRepository<MaintenanceRecord, String> {
	
	public MaintenanceRecord findByName(String name);
	public List<MaintenanceRecord> findByType(String type);
	
}
