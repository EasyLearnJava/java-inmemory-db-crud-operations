package com.easylearnjava.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.easylearnjava.util.DBConnection;

public class ReadRecords {

	public static void main(String[] args) {

		Connection conn = DBConnection.getH2DBConnection();
		try {
			insertEmployeeRecords(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Insert Employee records
	public static void insertEmployeeRecords(Connection connection){
		
		PreparedStatement pStmt = null;
		String createSQL = "SELECT * FROM EMPLOYEE";
		try{
			pStmt = connection.prepareStatement(createSQL);
			ResultSet rs = pStmt.executeQuery();
			System.out.println("EMPLOYEE ID " + "\t" + "EMPLOYEE NAME " + "\t" + "EMPLOYEE PASSWORD");
			System.out.println("----------- " + "\t" + "-------------- " + "\t" + "-----------------");
			while (rs.next()) {
				int id = rs.getInt("EMP_ID");
				String name = rs.getString("EMP_NAME");
				String password = rs.getString("EMP_PASSWORD");
				System.out.println(id + "\t\t" + name + "\t\t" + password);
			}			
			pStmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}		

}

