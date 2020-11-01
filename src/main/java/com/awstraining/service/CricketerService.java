package com.awstraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CricketerService {

	public List<Cricketer> findAll() {
		List<Cricketer> cricketers = new ArrayList<Cricketer>();
		
		
		Cricketer cricketer = new Cricketer();
		cricketer.setName("Butler");
		cricketer.setTeam("Rajasthan Royals");
		cricketers.add(cricketer);
		
		
		cricketer = new Cricketer();
		cricketer.setName("KL Rahul");
		cricketer.setTeam("KXI Punjab");
		cricketers.add(cricketer);
		
		
		cricketer = new Cricketer();
		cricketer.setName("Dhoni");
		cricketer.setTeam("CSK");
		cricketers.add(cricketer);
		
		
		cricketer = new Cricketer();
		cricketer.setName("A B De villiers");
		cricketer.setTeam("RCB");
		cricketers.add(cricketer);
		
		cricketer = new Cricketer();
		cricketer.setName("Andre Rusell");
		cricketer.setTeam("KKR");
		
		cricketer = new Cricketer();
		cricketer.setName("Bumrah");
		cricketer.setTeam("Mumbai Indians");
		cricketers.add(cricketer);
		
		
		cricketer = new Cricketer();
		cricketer.setName("Shikhar Dawan ");
		cricketer.setTeam("Delhi Capitals");
		cricketers.add(cricketer);
		return cricketers;
		
	}

}
