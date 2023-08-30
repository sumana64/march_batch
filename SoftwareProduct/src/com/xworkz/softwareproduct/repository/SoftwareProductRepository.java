package com.xworkz.softwareproduct.repository;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;

public interface SoftwareProductRepository {
	
	boolean onSave(SoftwareProductDto dto) throws SQLException;
	
	boolean search(String version) throws SQLException;
	
	boolean search(int  id) throws SQLException;
	
	boolean search1(String softwareName) throws SQLException;
	
	boolean update(double price,String version,String osVersion) throws SQLException;
	
	boolean update(int id,String name,String emaill,long phoneNo,String softwareName,String version,String dateOfExpiry,String password,double price,String osVersion) throws SQLException;
	
	boolean readAll() throws SQLException;
	
	boolean delete(String softwareName) throws SQLException;
	
	

}
