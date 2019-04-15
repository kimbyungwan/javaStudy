package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class DBconnection {
	private Connection conn;
	private PreparedStatement Pstmt;
	private ResultSet rs;

	public void connect() throws Exception {
//		-오라클 접속방법
//		1.오라클 드라이버 로드(Class.forName(className)사용)
//		2.DriveManager의 getConnection() 이용하여 DB 접속
//		3.Connection의 PrepareStatement()를 이용하여
//		쿼리문을 심고 PrepareStatement 리턴받음
//		4.PrepareStatement를 이용하여 쿼리실행
//		5.쿼리문  실행은 두가지가 있음
//			a. select문 : executeQuery()
//			b.insert, delete, update 문 : executeUpdate()
//		6.5번의 경우에서 a는 ResultSet을 리턴받음.
//		b는 정수를 리턴받음
//		7.select문을 쿼리로 실행했으면 ResultSet을 이용하여 리턴받은 값을 읽어내야함

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		conn = DriverManager.getConnection(url, "hr", "1234");

		StringBuilder query = new StringBuilder();
		query.append("SELECT FIRST_NAME, SALARY, DEPARTMENT_ID ");
		query.append("FROM EMPLOYEES ");

		Pstmt = conn.prepareStatement(query.toString());
		rs = Pstmt.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString("FIRST_NAME") + " ");
			System.out.print(rs.getInt("SALARY") + " ");
			System.out.println(rs.getInt("DEPARTMENT_ID"));
		}
		
		rs.close();
		Pstmt.close();
		conn.close();
	}

	public static void main(String[] args) throws Exception {
		DBconnection dbc = new DBconnection();
		dbc.connect();
	}
}
