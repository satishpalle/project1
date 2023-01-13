package com.techpalle.B44BootProject1;

public class Student {
	private int sno;
	private String sname;
	private String sub;
	
	public Student()
	{
		
	}
	
	public Student(int sno, String sname, String sub) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sub = sub;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	//generate constructor
	
	//generate setters & getters

}
