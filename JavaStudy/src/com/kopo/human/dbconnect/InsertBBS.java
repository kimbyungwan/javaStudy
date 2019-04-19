package com.kopo.human.dbconnect;

import java.util.ArrayList;

public class InsertBBS {
	
	public void insertBBS() {
		BBSDto article = new BBSDto();
		article.setId("human");
		article.setTitle("테스트용입니다");
		article.setContent("여러분 공부 합시다..~~~");
		
		BBSDaoImpl.getDBObject().insertBBS(article);
	}
	
	public void insertBBSALL() {
		ArrayList<BBSDto> articleList= new ArrayList<BBSDto>();
		BBSDto article;
		int i=0;
		while(i<10) {
	    article = new BBSDto();
		article.setId("fjirjfmkasldp;sd");
		article.setTitle("하ㅏ하하");
		article.setContent("키키키키~~~");
		articleList.add(article);
		i++;
		}
		BBSDaoImpl.getDBObject().insertBBSALL(articleList); 
	}
			
			
		
	public static void main(String[] args) {
		InsertBBS ib = new InsertBBS();
//		ib.insertBBS();
		ib.insertBBSALL();
	}
}
