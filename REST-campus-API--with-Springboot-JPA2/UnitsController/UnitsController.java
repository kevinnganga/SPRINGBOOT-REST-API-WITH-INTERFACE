package com.example.demo.UnitsController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitsController {
	
	@Autowired
	private UnitsService unitsservice;
	
	
	@RequestMapping("/units")
	public List<Units> AllUnits() {   //setting the return type to what the response should be 
								//I.E list of  units
		return  unitsservice.getAllUnits();
	}
	
	@RequestMapping("/units/{id}")
	public Units getOneUnit(@PathVariable String id) {
		
		 return unitsservice.getUnit(id);
	}
	
	@RequestMapping(method =RequestMethod.POST,value ="/units")
	public void AddUnit(@RequestBody Units unt) {
		
		unitsservice.addUnit(unt);
	}
	
	@RequestMapping(method =RequestMethod.PUT,value ="/units/{id}")
	public void UpdateUnit(@RequestBody Units unt, @PathVariable String id) {
		
		unitsservice.UpdateUnit(id,unt);
	}
	
	@RequestMapping(method =RequestMethod.DELETE,value ="/units/{id}")
	public void DeleteUnit(@PathVariable String id) {
		
		 unitsservice.deletingUnit(id);
	}
	}
