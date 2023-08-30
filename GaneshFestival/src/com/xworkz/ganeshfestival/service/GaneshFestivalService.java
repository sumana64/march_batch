package com.xworkz.ganeshfestival.service;

import java.sql.SQLException;

import com.xworkz.ganeshfestival.dto.GaneshFestivalDto;

public interface GaneshFestivalService {
	
	    boolean validateAndSave(GaneshFestivalDto dto) throws SQLException;
	    
	    boolean onUpdate(int id,String name) throws SQLException;
	    
	    boolean onUpdate(String poojariName,String prasada) throws SQLException;
	    
	    boolean onUpdate(String area,boolean permissionGranted) throws SQLException;
	    
	    boolean onUpdate(int id,float ganeshWeight,float ganeshHeight,String area,String prasada,String poojariName, boolean permissionGranted,int noOfDays) throws SQLException;

        boolean readAll() throws SQLException;
        
        boolean search(int id) throws SQLException;
        
        boolean search(String area) throws SQLException;
}
