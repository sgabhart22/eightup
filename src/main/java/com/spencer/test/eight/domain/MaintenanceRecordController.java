package com.spencer.test.eight.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/records")
public class MaintenanceRecordController {
	
	@Autowired
	private MaintenanceRecordService maintenanceRecordService;
	
	@PostMapping(path = "/new")
	public ResponseEntity<MaintenanceRecord> createRecord(@RequestBody MaintenanceRecord record) {
		return new ResponseEntity<>(maintenanceRecordService.insert(record), HttpStatus.OK);
	}
	
	@GetMapping(path = "/all")
	public ResponseEntity<List<MaintenanceRecord>> getAllRecords() {
		return new ResponseEntity<>(maintenanceRecordService.getRecords(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/type")
	public ResponseEntity<List<MaintenanceRecord>> getByType(@RequestParam String type) {
		return new ResponseEntity<>(maintenanceRecordService.getByType(type), HttpStatus.OK);
	}
	
	@PostMapping(path = "/update")
	public ResponseEntity<MaintenanceRecord> updateRecord(@RequestBody MaintenanceRecord record) {
		return new ResponseEntity<>(maintenanceRecordService.update(record), HttpStatus.OK);
	}
	
	@PostMapping(path = "/delete")
	public ResponseEntity<?> deleteRecord(@RequestBody MaintenanceRecord record) {
		maintenanceRecordService.delete(record);
		
		return new ResponseEntity<>("Record successfully removed.", HttpStatus.OK);
	}
}
