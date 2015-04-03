package com.easylearnjava.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.easylearnjava.util.DBConnection;

public class UpdateRecords {

	public static void main(String[] args) {

		Connection conn = DBConnection.getH2DBConnection();
		try {
			//update employee password with an employee id 2
			updateEmployeeRecords(conn, 2, "nosecret");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Update Employee records
	public static void updateEmployeeRecords(Connection connection, int id, String pwd){
		
		PreparedStatement pStmt = null;
		String updateSQL = "UPDATE EMPLOYEE SET EMP_PASSWORD = ? WHERE EMP_ID = ?";
		try{
			pStmt = connection.prepareStatement(updateSQL);
			pStmt.setString(1, pwd);
			pStmt.setInt(2, id);			
			int count = pStmt.executeUpdate();
			System.out.println("No of records effected : " + count);
			pStmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}		

}

