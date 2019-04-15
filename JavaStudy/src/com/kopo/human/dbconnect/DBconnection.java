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
//		-����Ŭ ���ӹ��
//		1.����Ŭ ����̹� �ε�(Class.forName(className)���)
//		2.DriveManager�� getConnection() �̿��Ͽ� DB ����
//		3.Connection�� PrepareStatement()�� �̿��Ͽ�
//		�������� �ɰ� PrepareStatement ���Ϲ���
//		4.PrepareStatement�� �̿��Ͽ� ��������
//		5.������  ������ �ΰ����� ����
//			a. select�� : executeQuery()
//			b.insert, delete, update �� : executeUpdate()
//		6.5���� ��쿡�� a�� ResultSet�� ���Ϲ���.
//		b�� ������ ���Ϲ���
//		7.select���� ������ ���������� ResultSet�� �̿��Ͽ� ���Ϲ��� ���� �о����

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
