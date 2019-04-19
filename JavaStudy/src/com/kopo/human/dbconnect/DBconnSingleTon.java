package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

import com.kopo.human.SingleTonTest;

public class DBconnSingleTon {
	private static DBconnSingleTon DST = new DBconnSingleTon();

	private DBconnSingleTon() {

	}

	public static DBconnSingleTon getDBconn() {
		if (DST == null) {
			DST = new DBconnSingleTon();
		}
		return DST;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			conn = DriverManager.getConnection(url, "hr", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}


