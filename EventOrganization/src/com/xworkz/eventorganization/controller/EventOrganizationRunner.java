package com.xworkz.eventorganization.controller;

import java.sql.SQLException;

import com.xwork.eventorganization.service.EventOrganizationService;
import com.xwork.eventorganization.service.EventOrganizationServiceImpl;
import com.xworkz.eventorganization.dto.EventOrganizationDto;

public class EventOrganizationRunner {
	
	public static void main(String[] args) throws SQLException {
		
		EventOrganizationDto dto = new EventOrganizationDto();
		dto.setId(3);
		dto.setName("Nirmala");
		dto.setEmail("nirmal@gmail.com");
		dto.setPhoneNo(987654579L);
		dto.setAddress("Nagarabhavi");
		dto.setEvent("bithdayparty");
		dto.setEventDate("12th august");
		dto.setEventLocation("bengaluru");
		dto.setEventToBeConducted("Indoor");
		dto.setNoOfGuest(30);
		dto.setNoOfDays(1);
		
		System.out.println(dto);
		
		EventOrganizationService service = new EventOrganizationServiceImpl();
		
		service.onSave(dto);
		
		//service.readAll();
		
		//service.read("nirmal@gmail.com", 987654579);
		
		//service.update("ni@gmail.com", 987654579);
		
		//service.search1("ni@gmail.com");
		
		//service.search2(987654579);
		
		//service.search3("Nirmala");
		
		//service.delete("ni@gmail.com");
		
		
	
	
	}

}
