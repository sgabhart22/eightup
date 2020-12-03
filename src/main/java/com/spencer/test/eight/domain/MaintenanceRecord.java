package com.spencer.test.eight.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="records")
public class MaintenanceRecord {
	
	@Id
	public String id;
	
	public String type, name;
	
	public List<MaintenanceRecordEntry> entries;

	public MaintenanceRecord() {
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<MaintenanceRecordEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<MaintenanceRecordEntry> entries) {
		this.entries = entries;
	}

	@Override
	public String toString() {
		return "MaintenanceRecord [id=" + id + ", type=" + type + ", name=" + name + ", entries=" + entries + "]";
	}

}
