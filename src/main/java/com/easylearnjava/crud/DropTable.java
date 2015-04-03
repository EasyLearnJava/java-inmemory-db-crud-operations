package com.easylearnjava.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.easylearnjava.util.CheckForATableInDB;
import com.easylearnjava.util.DBConnection;

public class DropTable {  
	
	public static void main(String[] args) {

		Connection conn = DBConnection.getH2DBConnection();
		try {
			dropEmployeeTable(conn);
			CheckForATableInDB.checkIfTableExists(conn, "EMPLOYEE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Drop table 
	public static void dropEmployeeTable(Connection connection){
		
		PreparedStatement pStmt = null;
		String dropSQL = "DROP TABLE EMPLOYEE;";
		try{
			pStmt = connection.prepareStatement(dropSQL);
			pStmt.execute();			
			pStmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
