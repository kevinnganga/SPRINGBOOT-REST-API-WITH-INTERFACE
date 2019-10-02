package com.example.demo.UnitsController;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UnitsController {
	
	@Autowired
	private UnitsService unitsservice;

	@Autowired
	private UnitsRepository unitsrepository;
	
/*...............................OK.......................*/
	@RequestMapping("/")
	public String root() {   
		return  "home.jsp";
	}

	
	/*...............................OK.......................*/
	@RequestMapping("/units")
	public String OneUnits( String id,Model themodel) {  
		
	Units units = unitsservice.getUnit(id);
	themodel.addAttribute("Myunits",units);
		return  "index.jsp";
	}
	

	
	/*...............................OK.......................*/
	@RequestMapping("/unit")
	public String AllUnits(Model themodel) {  

		Iterable<Units> all = unitsrepository.findAll();
		themodel.addAttribute("kevo",all);
		
		return "me.jsp";
		
	}
	
	//ALSO WORKS FINE
//	@RequestMapping("/unit")
//	public String AllUnits(Model themodel) {  
//
//		Iterable<Units> allUnits = unitsservice.getAllUnits();
//		themodel.addAttribute("kevo",allUnits);
//		
//		return "me.jsp";
		
//	}
	
	/*...............................OK.......................*/
	
	@RequestMapping("/showAddUnit")
	public String ShowAddUnitsForm(Model themodel) {  

		Units un=new Units();
		themodel.addAttribute("adding",un);
		
		return "addUnit.jsp";
		
	}
	
	
	/*...............................OK.......................*/
	
	@PostMapping("/saveUnit")
	public String addUnit(@ModelAttribute("adding") Units theUnit) {
		unitsservice.addUnit(theUnit);
		return "redirect:/unit";
		
	}
	
	
	
	//ALSO WORKS PERFECTLY
	
//	@RequestMapping(method =RequestMethod.POST,value ="/saveUnit")
//	public String addUnit(@ModelAttribute("adding") Units theUnit) {
//		unitsservice.addUnit(theUnit);
//		return "redirect:/unit";
//		
//	}
	
	
	
	@GetMapping("/showFormForUpdate")
	//unitName is the name given in the me.jsp page to track the name of the units
	public String UpdateUnit(@RequestParam("unitName") String id,Model themodel) {
//CALLING THE METHOD TO GET ONE UNIT BASED ON THE "unitName"
		Units uni=unitsservice.getUnit(id);
		System.out.println(uni.toString());
		themodel.addAttribute("updateUnit",uni);
		//updateUnit is the model attribute name in the EditUnit.jsp file
		System.out.println("PROCESSING");
		
		return "EditUnit.jsp";
		
	}
	

	
	@PostMapping("/updateUnit")
	//@ResponseBody
	public String updateUnit( @RequestParam String name,Units unt) {
		unitsservice.UpdateUnit(name, unt);
		System.out.println("INSIDE PROCESSING TWO");
		//return "NAME: " + name;
		return "redirect:/unit";
		
	}

	
	@GetMapping("/delete")
	public String DeleteUnit(@RequestParam("unitName") String theid) {

		 unitsservice.deletingUnit(theid);
		 return "redirect:/unit";
	}
	}
