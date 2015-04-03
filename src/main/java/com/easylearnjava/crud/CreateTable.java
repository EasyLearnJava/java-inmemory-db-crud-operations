package com.easylearnjava.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.easylearnjava.util.CheckForATableInDB;
import com.easylearnjava.util.DBConnection;

public class CreateTable {  
	
	public static void main(String[] args) {

		Connection conn = DBConnection.getH2DBConnection();
		try {
			createEmployeeTable(conn);
			CheckForATableInDB.checkIfTableExists(conn, "EMPLOYEE"); //Use all capitals for the table name
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Create Employee table
	public static void createEmployeeTable(Connection connection){
		
		PreparedStatement pStmt = null;
		String createSQL = "CREATE TABLE EMPLOYEE(EMP_ID INT PRIMARY KEY, EMP_NAME VARCHAR(255), EMP_PASSWORD VARCHAR(255));";
		try{
			pStmt = connection.prepareStatement(createSQL);
			pStmt.execute();
			pStmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}	
	

}
