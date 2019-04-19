package com.kopo.human.dbconnect;

import java.util.ArrayList;

public class SelectBBS {
	
	public void SelectBBS(int articleNum) {
		BBSDaoImpl.getDBObject().selectBBS(articleNum);
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
		
	}
}
