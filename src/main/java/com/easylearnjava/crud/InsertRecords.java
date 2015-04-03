package com.easylearnjava.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.easylearnjava.util.DBConnection;

public class InsertRecords {

	public static void main(String[] args) {

		Connection conn = DBConnection.getH2DBConnection();
		try {
			insertEmployeeRecords(conn, 1, "raghu", "secret");
			insertEmployeeRecords(conn, 2, "naveen", "topsecret");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Insert Employee records
	public static void insertEmployeeRecords(Connection connection, int id, String name, String pwd){
		
		PreparedStatement pStmt = null;
		String insertSQL = "INSERT INTO EMPLOYEE (EMP_ID, EMP_NAME, EMP_PASSWORD) VALUES (?,?,?)";
		try{
			pStmt = connection.prepareStatement(insertSQL);
			pStmt.setInt(1, id);
			pStmt.setString(2, name);
			pStmt.setString(3, pwd);
			int count = pStmt.executeUpdate();
			System.out.println("No of records effected : " + count);
			pStmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}		

}

