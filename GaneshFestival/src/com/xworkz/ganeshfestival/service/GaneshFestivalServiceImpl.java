package com.xworkz.ganeshfestival.service;

import java.sql.SQLException;

import com.xworkz.ganeshfestival.dto.GaneshFestivalDto;
import com.xworkz.ganeshfestival.repository.GaneshFestivalRepository;
import com.xworkz.ganeshfestival.repository.GaneshFestivalRepositoryImpl;

public class GaneshFestivalServiceImpl implements GaneshFestivalService{
	
	 GaneshFestivalRepository repo = new  GaneshFestivalRepositoryImpl();

	@Override
	public boolean validateAndSave(GaneshFestivalDto dto) throws SQLException {
		if(dto!=null) {
			System.out.println("dto is not null we can save the data");
			boolean save = repo.onSave(dto);
			System.out.println(save);
			return true;
		}else {
			
			System.out.println("dto is null we cannot save tha data");
			return false;
		}
		
	}

	@Override
	public boolean onUpdate(int id, String name) throws SQLException {
		boolean update = false;
		if(id!=0 && name!=null) {
		  repo.onUpdate(id, name);
		    update = true;
		}
		return update;
		
		
	}

	@Override
	public boolean onUpdate(String poojariName, String prasada) throws SQLException {
		boolean update =false;
		if(poojariName!=null && prasada!=null) {
		repo.onUpdate(poojariName, prasada);
		update = true;
	}
		return update;
		
	}

	@Override
	public boolean onUpdate(String area, boolean permissionGranted) throws SQLException {
		boolean update = false;
		if(area!=null && permissionGranted==false) {
			repo.onUpdate(area, permissionGranted);
			update = true;
		}
		return update;
	}

	@Override
	public boolean onUpdate(int id, float ganeshWeight, float ganeshHeight, String area, String prasada,
			String poojariName, boolean permissionGranted, int noOfDays) throws SQLException {
		boolean update = false;
		if(id!=0 && ganeshWeight!=0 && ganeshHeight!=0 && area!=null && prasada!=null && poojariName!=null && permissionGranted!=false && noOfDays!=0) {
		repo.onUpdate(id, ganeshWeight, ganeshHeight, area, prasada, poojariName, permissionGranted, noOfDays);
		update = true;
		}
		return update;
	}

	@Override
	public boolean readAll() throws SQLException {
		boolean read = false;
		repo.readAll();
		return read;
	}

	@Override
	public boolean search(int id) throws SQLException {
		boolean read = false;
		if(id!=0) {
		repo.search(id);
		read = true;
		}
		return read;
	}

	@Override
	public boolean search(String area) throws SQLException {
		boolean update = false;
		if(area!=null) {
	       repo.search(area);
	       update = true;
		}
		return true;
	}

}
