package com.xworkz.ganeshfestival.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.ganeshfestival.dto.GaneshFestivalDto;
import com.xworkz.ganeshfestival.utils.GaneshFestivalUtils;

public class GaneshFestivalRepositoryImpl implements GaneshFestivalRepository {

	GaneshFestivalUtils util = new GaneshFestivalUtils();
	@Override
	public boolean onSave(GaneshFestivalDto dto) throws SQLException {
		
		System.out.println("Dto:" + dto);
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "insert into ganeshfestival1 values(?,?,?,?,?,?,?,?)";
		
		     PreparedStatement preparedStatement = connection.prepareStatement(query);
		     
		     System.out.println(preparedStatement);
		     
		     preparedStatement.setInt(1, dto.getId());
		     preparedStatement.setFloat(2, dto.getGaneshHeight());
		     preparedStatement.setFloat(3, dto.getGaneshWeight());
		     preparedStatement.setString(4, dto.getArea());
		     preparedStatement.setString(5, dto.getPrasada());
		     preparedStatement.setString(6, dto.getPoojariName());
		     preparedStatement.setBoolean(7, dto.isPermissionGranted());
		     preparedStatement.setInt(8, dto.getNoOfDays());
		     
		     System.out.println(preparedStatement);
		     
		     int rows = preparedStatement.executeUpdate();
              
		     if(rows>0) {
		          return true;
		     }else {
		    	 return false;
		     }
	
	}

	@Override
	public boolean onUpdate(int id, String pname) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "update ganeshfestival1 set poojariName = ? where id = ?";
		
	     PreparedStatement preparedStatement = connection.prepareStatement(query);

	     System.out.println(preparedStatement);
	     
	     preparedStatement.setString(1, pname);
	     
	     preparedStatement.setInt(2, id);
	     
	     System.out.println(preparedStatement);
	     
	     int rows = preparedStatement.executeUpdate();
	     
	     if(rows>0) {
	    
	    	 return true;
	     }else {
	    	 return false;
	     }
	}

	@Override
	public boolean onUpdate(String poojariName, String prasada) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "update ganeshfestival1 set prasada = ? where poojariName= ?";
		
	     PreparedStatement preparedStatement = connection.prepareStatement(query);

	     System.out.println(preparedStatement);
	     
	     preparedStatement.setString(1, poojariName);
	     
	     preparedStatement.setString(2, prasada);
	     
	     System.out.println(preparedStatement);
	     
	     int rows = preparedStatement.executeUpdate();
	     
	     if(rows>0) {
		     return true;
		    
	     }else {
		    	 return false;
		     }
	     
	    
	}

	@Override
	public boolean onUpdate(String area, boolean permissionUpdated) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);	
		
		String query = "update ganeshfestival1 set permissionGranted = ? where area=?";
		
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
		  
		  preparedStatement.setBoolean(1, permissionUpdated);
		  
		  preparedStatement.setString(2, area);
	
		  System.out.println(preparedStatement);
		  
		  int rows = preparedStatement.executeUpdate();
		  
		  System.out.println();
		  
		  if(rows>0) {
			  
		    return true;
		    
		  }else {
			  
		     return false;
		  }
	}

	@Override
	public boolean onUpdate(int id, float ganeshWeight, float ganeshHeight, String area, String prasada,
			
		String poojariName, boolean permissionGranted, int noOfDays) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);	
		
		String query="update ganeshfestival1 set ganeshWeight=? ,ganeshHeight=?,area=?,prasada=?,poojariName=?,permissionGranted=?,noOfDays=? where id=?";
	     PreparedStatement preparedStatement = connection.prepareStatement(query);
	     System.out.println(" before execution"+ preparedStatement);
	     preparedStatement.setFloat(1, ganeshWeight);
	     preparedStatement.setFloat(2, ganeshHeight);
	     preparedStatement.setString(3, area);
	     preparedStatement.setString(4, prasada);
	     preparedStatement.setString(5, poojariName);
	     preparedStatement.setBoolean(6, permissionGranted);
	     preparedStatement.setInt(7,noOfDays);
	     preparedStatement.setInt(8, id);
	     System.out.println("after execution"+preparedStatement);
	     preparedStatement.executeUpdate();
	     return true;
	}

	@Override
	public boolean readAll() throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "select * from ganeshfestival1";
 
	    PreparedStatement preparedStatement = connection.prepareStatement(query);
	    
	          ResultSet result = preparedStatement.executeQuery();

	          while(result.next()) {
	        	  
	        	  System.out.println(" id" + result.getInt(1)+" ganeshWeight" + result.getFloat(2) + " ganeshHeight" + result.getFloat(3) + " area" + result.getString(4) + " prasada" + result.getString(5) + " poojariName" + result.getString(6) + " permissionGranted" + result.getBoolean(7) + " noOfDays" + result.getInt(8));
	                    
	        	        return true;
	          }
		
		return false ;
	}

	@Override
	public boolean search(int id) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "select * from ganeshfestival1 where id = ?";
		
	    PreparedStatement preparedStatement = connection.prepareStatement(query);
	    
		preparedStatement.setInt(1, id);

		ResultSet result = preparedStatement.executeQuery();
		
		 while(result.next()) {
        	
      	  System.out.println(" id " + result.getInt(1) + " ganeshWeight " + result.getFloat(2) + " ganeshHeight " + result.getFloat(3) + " area " + result.getString(4) + " prasada " + result.getString(5) + " poojariName  " + result.getString(6) + " permissionGranted " + result.getBoolean(7) + " noOfDays " + result.getInt(8));
            
      	       return true;
        }
		
		return false;
	}

	@Override
	public boolean search(String area) throws SQLException {
		
		Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
		
		String query = "select* from  ganeshfestival1 where area = ?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1, area);
		
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			
			System.out.println("id:" + result.getInt(1)+"ganeshWeight:" + result.getFloat(2) + "ganeshHeight:" + result.getFloat(3) + "area:" + result.getString(4) + "prasada: " + result.getString(5) + "poojariName: " + result.getString(6) + "permissionGranted: " + result.getBoolean(7));
		       
			return true;
		
		}
		
		return false;
	
	}
	
	
	
	

	

}
