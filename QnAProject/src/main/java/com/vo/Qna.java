package com.vo;

public class Qna {
	String num;
	String pass;
	String name;
	String wdate;
	String title;
	String content;
	String ans;
	
	
	
	public Qna() {
		super();
	}



	public Qna(String num, String pass, String name, String wdate, String title, String content, String ans) {
		super();
		this.num = num;
		this.pass = pass;
		this.name = name;
		this.wdate = wdate;
		this.title = title;
		this.content = content;
		this.ans = ans;
	}



	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getWdate() {
		return wdate;
	}



	public void setWdate(String wdate) {
		this.wdate = wdate;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getans() {
		return ans;
	}



	public void setans(String ans) {
		this.ans = ans;
	}



	@Override
	public String toString() {
		return "Board [num=" + num + ", pass=" + pass + ", name=" + name + ", wdate=" + wdate + ", title=" + title
				+ ", content=" + content + ", ans=" + ans + "]";
	}



	
	
	
}
