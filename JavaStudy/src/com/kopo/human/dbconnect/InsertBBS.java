package com.kopo.human.dbconnect;

import java.util.ArrayList;

public class InsertBBS {
	
	public void insertBBS() {
		BBSDto article = new BBSDto();
		article.setId("human");
		article.setTitle("�׽�Ʈ���Դϴ�");
		article.setContent("������ ���� �սô�..~~~");
		
		BBSDaoImpl.getDBObject().insertBBS(article);
	}
	
	public void insertBBSALL() {
		ArrayList<BBSDto> articleList= new ArrayList<BBSDto>();
		BBSDto article;
		int i=0;
		while(i<10) {
	    article = new BBSDto();
		article.setId("fjirjfmkasldp;sd");
		article.setTitle("�Ϥ�����");
		article.setContent("ŰŰŰŰ~~~");
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
