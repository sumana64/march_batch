package com.xworkz.softwareproduct.controller;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;
import com.xworkz.softwareproduct.service.SoftwareProductService;
import com.xworkz.softwareproduct.service.SoftwareProductServiceImpl;

public class SoftwareProductRunner {
	
	public static void main(String[] args) throws SQLException {
		
		SoftwareProductDto dto = new SoftwareProductDto();
		dto.setId(1);
		dto.setName("Maya");
		dto.setEmaill("mn@gmail.com");
		dto.setPhoneNo(9876547575L);
		dto.setSoftwareName("MatLab");
		dto.setVersion("R2306");
		dto.setDateOfExpiry("23-06-2025");
		dto.setPassword("r123");
		dto.setPrice(5000.0);
		dto.setOsVersion("windows11");
		
		System.out.println(dto);
		
		SoftwareProductService service = new SoftwareProductServiceImpl();
		
		//service.onSave(dto);
		
		//service.search("windows11");
		
		//service.search(1);
		
		//service.search1("MatLab");
		
		//service.update(2000,"R3425","windows11");
		
		//service.readAll();
		
		service.update(1,"Pavithra", "pa123@gmail.com", 987656768L, "MatLab12", "R30342", "12-06-2030", "pa123", 3420, "windows7");
		
		//service.delete("MatLab");
		
	}

}
