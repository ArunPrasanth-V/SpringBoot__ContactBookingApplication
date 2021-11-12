package com.example.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delivary_to_DB {
	@Id
    private String name;
    private long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
    
}
