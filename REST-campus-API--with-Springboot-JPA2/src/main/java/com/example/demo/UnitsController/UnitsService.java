package com.example.demo.UnitsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitsService {
	
	@Autowired
	private UnitsRepository unitsrepository;
	

	
	//-----------------------------------------------------------------------------------------
	
	public Iterable<Units> getAllUnits(){
		
	Iterable<Units> all = unitsrepository.findAll();
	
		return all;
		 
	}
	
	//------------------------------------------------------------------------------------------
	public Units getUnit(String id) {
		
		return unitsrepository.findById(id).orElse(null);

		
		
	}

	public void addUnit(Units unt) {
		unitsrepository.save(unt);
		
	}

	public Units UpdateUnit(String name, Units unt) {

		return unitsrepository.save(unt);
	}

	public void deletingUnit(String id) {
		
		unitsrepository.deleteById(id);
				
	}

	

}
