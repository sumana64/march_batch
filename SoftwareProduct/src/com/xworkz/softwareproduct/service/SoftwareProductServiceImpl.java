package com.xworkz.softwareproduct.service;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;
import com.xworkz.softwareproduct.repository.SoftwareProductRepository;
import com.xworkz.softwareproduct.repository.SoftwareProductRepositoryImpl;

public class SoftwareProductServiceImpl implements SoftwareProductService{

	SoftwareProductRepository repo = new SoftwareProductRepositoryImpl();
	@Override
	public boolean onSave(SoftwareProductDto dto) throws SQLException {
		if(dto!=null) {
			repo.onSave(dto);
			System.out.println("dto is not null");
		}else {
			System.out.println("dto is null");
		}
		return true;
	}
	@Override
	public boolean search(String version) throws SQLException {
		boolean search = false;
		if(version!=null) {
		     repo.search(version);
			search = true;
			
		}
		return search;
	}
	@Override
	public boolean search(int id) throws SQLException {
		boolean search = false;
		if(id!=0) {
		     repo.search(id);
			search = true;
			
		}
		return search;
		
	}
	@Override
	public boolean search1(String softwareName) throws SQLException {
		boolean search = false;
		if(softwareName!=null) {
		     repo.search(softwareName);
			search = true;
			
		}
		return search;
		
	}
	@Override
	public boolean update(double price, String version, String osVersion) throws SQLException {
		boolean update = false;
		if(price!=0 && version!=null && osVersion!=null) {
			repo.update(price, version, osVersion);
			update = true;
		}
		return update;
	}
	@Override
	public boolean readAll() throws SQLException {
		boolean read=false;
		repo.readAll();
		read = true;
		return read;
	}
	@Override
	public boolean update(int id,String name, String email, long phoneNo, String softwareName, String version,
			String dateOfExpiry, String password, double price, String osVersion) throws SQLException {
		boolean update = false;
		if(name!=null && email!=null && phoneNo!=0 && softwareName!=null && version!=null && dateOfExpiry!=null && password!=null && price!=0 && osVersion!=null && id!=0) {
		repo.update(id,name, email, phoneNo, softwareName, version, dateOfExpiry, password, price, osVersion);
		  update = true;
		}
		
		return update;
		
	}
	@Override
	public boolean delete(String softwareName) throws SQLException {
		boolean delete = false;
		if(softwareName!=null) {
			repo.delete(softwareName);
			delete= true;
		}
		return delete;
	}
	
	

}
