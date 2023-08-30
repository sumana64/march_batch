package com.xworkz.eventorganization.repository;

import java.sql.SQLException;

import com.xworkz.eventorganization.dto.EventOrganizationDto;

public interface EventOrganizationRepository {

	   boolean onSave(EventOrganizationDto dto) throws SQLException;
	   
	   boolean readAll() throws SQLException;
	   
	   boolean read(String email,long phoneNo) throws SQLException;
	   
	   boolean update(String email,long phoneNo) throws SQLException;
	   
	   boolean search1(String email) throws SQLException;
	   
	   boolean search2(long phoneNo) throws SQLException;
	   
	   boolean search3(String name) throws SQLException;
	   
	   boolean delete(String email) throws SQLException;
	   
	   
	
	
	
}
