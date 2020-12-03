package com.spencer.test.eight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spencer.test.eight.domain.MaintenanceRecordRepository;

@SpringBootApplication
public class EightApplication {

	@Autowired
	MaintenanceRecordRepository maintenanceRecordRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EightApplication.class, args);
	}

}
