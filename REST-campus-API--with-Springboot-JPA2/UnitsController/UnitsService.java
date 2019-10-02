package com.example.demo.UnitsController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.x500.X500Principal;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.stereotype.Service;

@Service
public class UnitsService {
	
	private List<Units> units=new ArrayList<>(Arrays.asList(
			
			//units objects
			new Units("unix", 1002, "Compuer Science"),
			new Units("Java", 1702, "Compuer Science"),
			new Units("RUBY", 1982, "I.T")
			
			));
	
	//-----------------------------------------------------------------------------------------
	
	public List<Units> getAllUnits(){
		
		return units;
		
	}
	
	//------------------------------------------------------------------------------------------
	public Units getUnit(String id) {
		
		return units.stream().filter(x -> x.getName().equals(id)).findFirst().get();
		
		
	}

	public void addUnit(Units unt) {

		units.add(unt);
	}

	public void UpdateUnit(String id, Units unt) {

		for(int i=0; i<units.size(); i++) {
			Units u=units.get(i);
			if(u.getName().equals(id)) {
				units.set(i, unt);
				return;
			}
		}
	}

	public void deletingUnit(String id) {
		
		units.removeIf(y ->y.getName().equals(id));
				
	}

}
