package com.xworkz.ganeshfestival.controller;

import java.sql.SQLException;

import com.xworkz.ganeshfestival.dto.GaneshFestivalDto;
import com.xworkz.ganeshfestival.service.GaneshFestivalService;
import com.xworkz.ganeshfestival.service.GaneshFestivalServiceImpl;

public class GaneshFestivalRunner {
	
	public static void main(String[] args) throws SQLException {
		
	 GaneshFestivalDto dto = new GaneshFestivalDto();
	 dto.setId(1);
	 dto.setGaneshHeight(12.0f);
	 dto.setGaneshWeight(70);
	 dto.setArea("rajajinagar");
	 dto.setPermissionGranted(true);
	 dto.setPoojariName("shashtri");
	 dto.setPrasada("kadalekalu husli");
	 dto.setNoOfDays(10);
	 
	 System.out.println(dto);
	 
	 GaneshFestivalService service = new GaneshFestivalServiceImpl();
	 
	 //service.validateAndSave(dto);	
	 
	// service.onUpdate(1, "Raghav");
	 
	// service.onUpdate("Raghav", "modaka");
	 
	// service.onUpdate("rajajinagar", false);
	 
	service.onUpdate(1, 20.0f, 50.0f, "sadhashivnagar", "chitranna", "rama", true, 5);
		
	   // service.readAll();
	 
	  // service.search(1);
	 
	 //service.search("rajajinagr");
	
	}

}
