package co.ayush.spring_demo_maven;

import org.springframework.beans.factory.annotation.Value;

public class Student1 {
	@Value("111")
	private int stid;
	@Value("ravishankar")
	private String stname;
	
	public Student1() {}
	public Student1(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	
}
