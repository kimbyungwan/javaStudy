package com.kopo.human;

public class BDSDto {
	private int articleNum;
	private String title;
	private String id;
	private String contents;
	private String fname;
	public int getArticleNum() {
		return articleNum;
	}
	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "BDSDto [articleNum=" + articleNum + ", title=" + title + ", id=" + id + ", contents=" + contents
				+ ", fname=" + fname + "]";
	}
	
	

}
