package com.xworkz.softwareproduct.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;
import com.xworkz.softwareproduct.util.SoftwareProductUtil;

public class SoftwareProductRepositoryImpl implements SoftwareProductRepository {
	
	SoftwareProductUtil util = new SoftwareProductUtil();

	@Override
	public boolean onSave(SoftwareProductDto dto) throws SQLException {
		
		System.out.println("Dto :" + dto);
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "insert into matlab values(?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
		
		preparedStatement.setInt(1, dto.getId());
		preparedStatement.setString(2, dto.getName());
		preparedStatement.setString(3, dto.getEmaill());
		preparedStatement.setLong(4, dto.getPhoneNo());
		preparedStatement.setString(5, dto.getSoftwareName());
		preparedStatement.setString(6, dto.getVersion());
		preparedStatement.setString(7, dto.getDateOfExpiry());
		preparedStatement.setString(8, dto.getPassword());
		preparedStatement.setDouble(9, dto.getPrice());
		preparedStatement.setString(10, dto.getOsVersion());
		
		System.out.println(preparedStatement);
		
		
		int rows = preparedStatement.executeUpdate();
		
	    if(rows>0) {
	    	
	    	System.out.println("rows effected");
		
	    	return true;
	    
	    }else {
	    	
	    	System.out.println("rows are not effected");
	    	
	    	return false;
	    }
	
	}

	@Override
	public boolean search(String version) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "select * from matlab where version=?";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
        
		preparedStatement.setString(1, version);
		
		ResultSet result =preparedStatement.executeQuery();
		
		while(result.next()) {
			
			System.out.println(" id : " + result.getInt(1) + " name:  " + result.getString(2) + " email : " + result.getString(3) + " phoneNo: " + result.getLong(4) + " softwareName: " + result.getString(5) + " version : " + result.getString(6) + " dateOfExpiry: " + result.getString(7) + " password: " + result.getString(8) + " price: " + result.getDouble(9) + " osVersion: " + result.getString(10));
		
		return true;
		
		}
		
		return false;
	}

	@Override
	public boolean search(int id) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "select * from matlab where id=?";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
        
		preparedStatement.setInt(1, id);
		
		ResultSet result =preparedStatement.executeQuery();
		
		while(result.next()) {
			
			System.out.println(" id : " + result.getInt(1) + " name:  " + result.getString(2) + " email : " + result.getString(3) + " phoneNo: " + result.getLong(4) + " softwareName: " + result.getString(5) + " version : " + result.getString(6) + " dateOfExpiry: " + result.getString(7) + " password: " + result.getString(8) + " price: " + result.getDouble(9) + " osVersion: " + result.getString(10));
		
		return true;
		
		}
		
		return false;
	}

	@Override
	public boolean search1(String softwareName) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "select * from matlab where softwareName=?";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
        
		preparedStatement.setString(1, softwareName);
		
		ResultSet result =preparedStatement.executeQuery();
		
		while(result.next()) {
			
			System.out.println(" id : " + result.getInt(1) + " name:  " + result.getString(2) + " email : " + result.getString(3) + " phoneNo: " + result.getLong(4) + " softwareName: " + result.getString(5) + " version : " + result.getString(6) + " dateOfExpiry: " + result.getString(7) + " password: " + result.getString(8) + " price: " + result.getDouble(9) + " osVersion: " + result.getString(10));
		
		return true;
		}
		
		return false;
	}

	@Override
	public boolean update(double price, String version, String osVersion) throws SQLException {

		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "update matlab set price = ?, version =? where osVersion=? ";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
        
		preparedStatement.setDouble(1, price);
		
		preparedStatement.setString(2, version);
		
		preparedStatement.setString(3, osVersion);
		
		int rows = preparedStatement.executeUpdate();
		
		  if(rows>0) {
		    	System.out.println("rows effected");
			
		    	return true;
		 }else {
		    
			 System.out.println("rows are not effected");
		    	
			 return false;
		 }
		
	}

	@Override
	public boolean readAll() throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "select * from matlab";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
		
		ResultSet result =preparedStatement.executeQuery();
		
		while(result.next()) {
			
			System.out.println(" id : " + result.getInt(1) + " name:  " + result.getString(2) + " email : " + result.getString(3) + " phoneNo: " + result.getLong(4) + " softwareName: " + result.getString(5) + " version : " + result.getString(6) + " dateOfExpiry: " + result.getString(7) + " password: " + result.getString(8) + " price: " + result.getDouble(9) + " osVersion: " + result.getString(10));
		
		return true;
		
		}
		
		return false;
	}

	@Override
	public boolean update(int id,String name, String emaill, long phoneNo, String softwareName, String version,
	           String dateOfExpiry, String password, double price, String osVersion) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "update matlab set name=?, emaill=?, phoneNo=?, softwareName=?, version=?, dateOfExpiry=?, password=?, price=?, osVersion=? where id=?";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
        
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, emaill);
		preparedStatement.setLong(3, phoneNo);
		preparedStatement.setString(4, softwareName);
		preparedStatement.setString(5, version);
		preparedStatement.setString(6, dateOfExpiry);
		preparedStatement.setString(7, password);
		preparedStatement.setDouble(8, price);
		preparedStatement.setString(9, osVersion);
		preparedStatement.setInt(10, id);
		
		System.out.println(preparedStatement);
	
		int rows = preparedStatement.executeUpdate();
		
		  if(rows>0) {
		    	System.out.println("rows effected");
			
		    	return true;
		 }else {
		    
			 System.out.println("rows are not effected");
		    	
			 return false;
		 }
		
	
	}

	@Override
	public boolean delete(String softwareName) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);

		String query = "delete from matlab where softwareName=? ";
		
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
		
		preparedStatement.setString(1,softwareName);
		
		int rows = preparedStatement.executeUpdate();
		
		  if(rows>0) {
		    	System.out.println("rows effected");
			
		    	return true;
		 }else {
		    
			 System.out.println("rows are not effected");
		    	
			 return false;
		 }
		
		
		
	}


	
	

}
