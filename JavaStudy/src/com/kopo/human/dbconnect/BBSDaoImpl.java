package com.kopo.human.dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BBSDaoImpl {
	private static BBSDaoImpl BDII = new BBSDaoImpl();

	private Connection conn;
	private PreparedStatement Pstmt;
	private ResultSet rs;
	private StringBuilder query;

	private BBSDaoImpl() {
	}

	public static BBSDaoImpl getDBObject() {
		if (BDII == null) {
			BDII = new BBSDaoImpl();
		}
		return BDII;
	}

	public void insertBBS(BBSDto article) {
		try {
			query = new StringBuilder();
			query.append("INSERT INTO BBS VALUES(");
			query.append("BBS_SEQ.NEXTVAL,?,?,?,sysdate,?)");
			conn = DBconnSingleTon.getDBconn().getConnection();
			Pstmt = conn.prepareStatement(query.toString());
			Pstmt.setString(1, article.getId());
			Pstmt.setString(2, article.getTitle());
			Pstmt.setString(3, article.getContent());
			Pstmt.setString(4, article.getFname());
			Pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertBBSALL(ArrayList<BBSDto> articleList) {
		try {
			query = new StringBuilder();
			query.append("INSERT INTO BBS VALUES(");
			query.append("BBS_SEQ.NEXTVAL,?,?,?,sysdate,?)");
			conn = DBconnSingleTon.getDBconn().getConnection();
			Pstmt = conn.prepareStatement(query.toString());
			for (BBSDto article : articleList) {
				Pstmt.setString(1, article.getId());
				Pstmt.setString(2, article.getTitle());
				Pstmt.setString(3, article.getContent());
				Pstmt.setString(4, article.getFname());
				Pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectBBS(int articleNum) {
		try {
			query = new StringBuilder();
			query.append("select * ");
			query.append("from BBS ");
			query.append("where articleNum=? ");
			conn = DBconnSingleTon.getDBconn().getConnection();
			Pstmt = conn.prepareStatement(query.toString());
			Pstmt.setInt(1, articleNum);
			rs = Pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt("articleNum") + "");
				System.out.println(rs.getInt("id") + " ");
				System.out.println(rs.getInt("title") + " ");
				System.out.println(rs.getInt("content") + "");
				System.out.println(rs.getInt("writeDate") + " ");
				System.out.println(rs.getInt("fname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateBBS(int articleNum) {
		try {
			query = new StringBuilder();
			query.append("update BBS ");
			query.append("set id=? ");
			query.append("where articleNum=? ");
			conn = DBconnSingleTon.getDBconn().getConnection();
			Pstmt = conn.prepareStatement(query.toString());
			Pstmt.setString(1, "today");
			Pstmt.setInt(2, articleNum);
		    Pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteBBS(int articleNum) {
		try {
			query = new StringBuilder();
			query.append("DELETE ");
			query.append("FROM BBS ");
			query.append("where articleNum=? ");
			conn = DBconnSingleTon.getDBconn().getConnection();
			Pstmt = conn.prepareStatement(query.toString());
			Pstmt.setInt(1, articleNum);
			Pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
